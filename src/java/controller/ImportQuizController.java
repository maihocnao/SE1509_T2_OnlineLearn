/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-11-4    1.0        Cuong             ImportQuiz
 */
package controller;

import bean.Answer;
import bean.Question;
import dao.AnswerDAO;
import dao.QuestionDAO;
import dao.impl.AnswerDaoImpl;
import dao.impl.QuestionDaoImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Process:<br>
 * - updown quizz and import quizz
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */
public class ImportQuizController extends HttpServlet {

    private static final String UPLOAD_DIRECTORY = "upload";

    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

    private static final String SUBJECT = "SUBJECT";
    private static final String LEVEL = "LEVEL";
    private static final String QUESTION = "QUESTION";
    private static final String ANWSER = "ANWSER";
    private static final String RESULT = "RESULT";
    private static final int QUESTION_INDEX = 0;
    private static final int ANWSER_INDEX = 1;
    private static final int RESULT_INDEX = 2;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("import.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(ServletFileUpload.isMultipartContent(request));
        if (ServletFileUpload.isMultipartContent(request)) {

            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setSizeThreshold(MEMORY_THRESHOLD);
                factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setFileSizeMax(MAX_FILE_SIZE);
                upload.setSizeMax(MAX_REQUEST_SIZE);
                String uploadPath = getServletContext().getRealPath("")
                        + File.separator + UPLOAD_DIRECTORY;
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                }
                List<FileItem> formItems = upload.parseRequest(request);
                if (formItems != null && formItems.size() > 0) {
                    for (FileItem item : formItems) {
                        if (!item.isFormField()) {
                            String fileName = new File(item.getName()).getName();
                            String filePath = uploadPath + File.separator + getFileName(fileName);
                            File storeFile = new File(filePath);
                            item.write(storeFile);
                            readFile(storeFile);
                            request.setAttribute("message", "File "
                                    + fileName + " has uploaded successfully!");
                        }
                    }
                }
            } catch (FileUploadException ex) {
                Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.getRequestDispatcher("import.jsp").forward(request, response);
    }

    private String getImportMessage(boolean isSuccess, String fileName) {
        if (isSuccess) {
            return "File " + fileName + " has uploaded successfully!";
        }
        return "File " + fileName + " has uploaded fail!!!";
    }

    private String getFileName(String fName) {
        String exten = fName.substring(fName.lastIndexOf("."), fName.length());
        return System.currentTimeMillis() + exten;
    }

    private Map<Question, List<Answer>> readFile(File target) {

        FileInputStream file = null;
        Map<Question, List<Answer>> result = new HashMap<>();
        try {
            file = new FileInputStream(target);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            //subject
            String subject = sheet.getRow(0).getCell(0).getStringCellValue();
            //level
            String level = sheet.getRow(1).getCell(0).getStringCellValue();
            List<Row> question = new ArrayList<>();
            int lasRow = sheet.getLastRowNum() + 1;
            for (int i = 3; i <= lasRow; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    question.add(row);
                } else {
                    try {
                        insertData(question, subject, level);
                    } catch (Exception ex) {
                        Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    question.clear();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(ImportQuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    private void insertData(List<Row> data, String subjectId, String level) throws Exception {
        Question question = new Question();
        QuestionDAO qDao = new QuestionDaoImpl();
        //question
        question.setContent(data.get(QUESTION_INDEX).getCell(1).getStringCellValue());
        question.setSubjectID(subjectId);
        question.setLevel(level);
        qDao.insertOne(question);
        int qId = qDao.getQuestionId(question.getSubjectID(), question.getContent(), question.getLevel());
        //result
        String strResult = data.get(RESULT_INDEX).getCell(1).getNumericCellValue() + "";
        int qResult = (int) Double.parseDouble(strResult);
        //answers
        List<Answer> ans = new ArrayList<>();
        Row ansRow = data.get(ANWSER_INDEX);
        int lastIndexAns = ansRow.getLastCellNum();
        for (int i = 1; i < lastIndexAns; i++) {
            Answer a = new Answer();
            a.setQuestionID(qId);
            a.setContent(ansRow.getCell(i).getStringCellValue());
            a.setResult((i == qResult) ? 1 : 0);
            ans.add(a);
        }
        AnswerDAO aswDao = new AnswerDaoImpl();
        aswDao.insertMany(ans);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
