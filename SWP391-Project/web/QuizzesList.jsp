<%-- 
    Document   : QuizzesList
    Created on : Oct 6, 2021, 10:50:08 AM
    Author     : ADMIN
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quizzes List</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div style="display: flex; justify-content: flex-end">
                <a href="#" class="btn btn-info" style="font-size: 18px">Add New Quiz</a>
            </div>
            <br>

            <form action="Quizzlist" method="POST" class="u-clearfix u-form-spacing-3 u-form-vertical u-inner-form" source="custom" name="form" style="padding: 0px;">
                <div class="u-form-group u-form-partition-factor-2 u-form-select u-form-group-1">
                    <label for="select-56c8" class="u-label">Subject</label>
                    <div class="u-form-select-wrapper">
                        <select id="select-56c8" name="select" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                            <c:forEach var="=s" items="${listsubject}">
                                <option${Subjectid == s.id ?"selected" :""} value ="${s.subjectid}">{s.name}</option>
                            </c:forEach>
                        </select>
                        <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                    </div>
                </div>
                <div class="u-form-group u-form-partition-factor-2 u-form-select u-form-group-2">
                    <label for="select-e299" class="u-label">Quiz Type</label>
                    <div class="u-form-select-wrapper">
                        <select id="select-e299" name="select-1" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                            <option value="Multiple Choice">Multiple Choice</option>
                        </select>
                        <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                    </div>
                </div>
                <div class="u-form-group u-form-group-3">
                    <label for="text-31f3" class="u-label">Search by content</label>
                    <input type="text" placeholder="Enter search here" id="text-31f3" name="text" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                </div>
                <div class="u-align-left u-form-group u-form-submit">
                    <a href="#" class="u-border-none u-btn u-btn-submit u-button-style u-hover-palette-2-base u-palette-4-base u-btn-2">Submit Filter</a>
                    <input type="submit" value="submit" class="u-form-control-hidden">
                </div>
            </form>

            <table class="table table-bordered">
                <thead style="background-color: #5bc0de;color: white">
                    <tr style="height: 38px;">
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">ID</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">Name</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">Level</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell"># of question</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">Duration (min)</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">Type</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell">Pass rate</th>
                        <th class="u-border-1 u-border-palette-4-base u-table-cell u-table-cell-8">Edit or Delete</th>
                    </tr>               
                </thead>
                <tbody>
                    <c:forEach var="item" items="${listquiz}">                       
                        <tr>
                            <td>${item.getQuizID()}</td>
                            <td>${item.getLessonID()}</td>
                            <td>${item.getQuizName()}</td>
                            <td>${item.getLevel()}</td>
                            <td>${item.getNumOfQuestion()}</td>
                            <td>${item.getDuration()}</td>
                            <td>${item.getPassRate()}</td>
                            <td>${item.getQuizType()}</td>
                            <td><a href="#">View</a> &nbsp;&nbsp; | &nbsp; &nbsp; <a href="#">Edit</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <!--            <div class="pagination">
                            <a href="#">&laquo;</a>
            <c:forEach var="item" items="${pageList}">
                <a href="${pageContext.request.contextPath}/admin/list-user?role=${role}&gender=${gender}&status=${status}&pageIndex=${item}" class="${item == pageIndex ? 'active':''}">${item}</a>
            </c:forEach>
            <a href="#">&raquo;</a>
        </div>-->
        </section>
        <br>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
