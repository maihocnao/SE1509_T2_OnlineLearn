package org.apache.jsp.lesson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"Start Now, Start Now, Start Now, Start Now, Login\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("        <title>List-User</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../2-Sign-up.css\" media=\"screen\">\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"../jquery.js\" defer=\"\"></script>\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"../nicepage.js\" defer=\"\"></script>\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"../static/js/register.js\" defer=\"\"></script>\n");
      out.write("        <meta name=\"generator\" content=\"Nicepage 3.25.0, nicepage.com\">\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("        <script src=\"https://cdn.ckeditor.com/ckeditor5/30.0.0/classic/ckeditor.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("        <meta property=\"og:title\" content=\"2 Sign up\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <style>\n");
      out.write("            .ck-editor__editable {\n");
      out.write("                min-height: 400px;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .ck-editor__editable p{\n");
      out.write("                margin:  0;\n");
      out.write("            }\n");
      out.write("            .table {\n");
      out.write("                width: 70%;\n");
      out.write("                margin:  0 auto;\n");
      out.write("            }\n");
      out.write("            th,td{\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            .table td{\n");
      out.write("                margin: 15px 5px;\n");
      out.write("            }\n");
      out.write("            .table input {\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 5px;\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            .table input:focus{\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .table .left-side{\n");
      out.write("                background-color: #ededed;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                font-size: 19px\n");
      out.write("            }\n");
      out.write("            .center{\n");
      out.write("                width: 80%;\n");
      out.write("                align-self: center;\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common-layout/header.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <section class=\"u-clearfix u-section-1 center\" id=\"sec-955d\">\n");
      out.write("            <div style=\"font-size: 25px\">\n");
      out.write("                Lesson Detail\n");
      out.write("            </div>\n");
      out.write("            <form action=\"save\" method=\"POST\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getLessonID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <div class=\"col\" style=\"width: 70%\">\n");
      out.write("                    <div class=\"row mb-2\" >\n");
      out.write("                        <div class=\"col-md-6\"> \n");
      out.write("                            <label>Name</label><br>\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getLessonName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"style=\"width: 100%\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">       \n");
      out.write("                            <label>Type</label><br>\n");
      out.write("                            <select class=\"col\" style=\"width: 100%;height: 30px\" name=\"type\">\n");
      out.write("                                <option value=\"Youtube\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getLessonType() == 'Youtube'? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Youtube</option>\n");
      out.write("                                <option value=\"Quiz\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getLessonType() == 'Quiz'? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Quiz</option>\n");
      out.write("                                <option value=\"Lesson\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getLessonType() == 'Lesson'? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Lesson</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col-md-6\">  \n");
      out.write("                            <label>SubjectID</label><br>\n");
      out.write("                            <select class=\"col\" style=\"width: 100%;height: 30px\">\n");
      out.write("                                <option>test 1</option>\n");
      out.write("                                <option>test 2</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">   \n");
      out.write("                            <label>Order</label><br>\n");
      out.write("                            <input type=\"text\" style=\"width: 100%\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col\"> \n");
      out.write("                            <label>Video Link</label><br>\n");
      out.write("                            <input type=\"text\" name=\"link\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getYoutubeLink()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 100%\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col\"> \n");
      out.write("                            <label>HTML Content</label><br>\n");
      out.write("                             <textarea name=\"content\" id=\"editor\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getContent()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <input class=\"btn btn-info\" style=\"width: 20%;margin-left: 15px;font-size: 16px; color: white;\" type=\"submit\" value=\"Submit\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        <br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common-layout/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            ClassicEditor\n");
      out.write("                    .create(document.querySelector('#editor'))\n");
      out.write("                    .catch(error => {\n");
      out.write("                        console.error(error);\n");
      out.write("                    });\n");
      out.write("            CKEDITOR.replace('editor2', {\n");
      out.write("                height: 260,\n");
      out.write("                /* Default CKEditor 4 styles are included as well to avoid copying default styles. */\n");
      out.write("                contentsCss: [\n");
      out.write("                    'http://cdn.ckeditor.com/4.16.2/full-all/contents.css',\n");
      out.write("                    'https://ckeditor.com/docs/ckeditor4/4.16.2/examples/assets/css/classic.css'\n");
      out.write("                ],\n");
      out.write("                removeButtons: 'PasteFromWord'\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
