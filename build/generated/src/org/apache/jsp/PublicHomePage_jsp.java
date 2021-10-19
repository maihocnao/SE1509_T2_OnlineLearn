package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PublicHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html style=\"font-size: 16px;\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"keywords\" content=\"Post 1 Headline, Post 2 Headline, About Us, Course\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("    <title>Homepage</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"7-Homepage.css\" media=\"screen\">\n");
      out.write("    <script class=\"u-script\" type=\"text/javascript\" src=\"jquery.js\" defer=\"\"></script>\n");
      out.write("    <script class=\"u-script\" type=\"text/javascript\" src=\"nicepage.js\" defer=\"\"></script>\n");
      out.write("    <meta name=\"generator\" content=\"Nicepage 3.25.0, nicepage.com\">\n");
      out.write("    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script type=\"application/ld+json\">{\n");
      out.write("\t\t\"@context\": \"http://schema.org\",\n");
      out.write("\t\t\"@type\": \"Organization\",\n");
      out.write("\t\t\"name\": \"\",\n");
      out.write("\t\t\"logo\": \"images/da817cf6d1dc43f99b0dc8d48bcbeffb.png\",\n");
      out.write("\t\t\"sameAs\": []\n");
      out.write("}</script>\n");
      out.write("    <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("    <meta property=\"og:title\" content=\"7 Homepage\">\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"u-body\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       ");
      out.write("\n");
      out.write("    <section class=\"u-align-center u-clearfix u-section-1\" id=\"sec-de65\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <h1 class=\"u-text u-text-1\">Popular posts</h1>\n");
      out.write("        \n");
      out.write("       ");
      out.write("\n");
      out.write("        <div class=\"pointer-event u-carousel u-expanded-width-xs u-gallery u-layout-carousel u-lightbox u-no-transition u-show-text-always u-gallery-1\" id=\"carousel-e131\" data-interval=\"5000\" data-u-ride=\"carousel\">\n");
      out.write("          <div class=\"u-carousel-inner u-gallery-inner\" role=\"listbox\">\n");
      out.write("              ");
      out.write("\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <a class=\"u-absolute-vcenter u-carousel-control u-carousel-control-prev u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-carousel-control-1\" href=\"#carousel-e131\" role=\"button\" data-u-slide=\"prev\">\n");
      out.write("            <span aria-hidden=\"true\">\n");
      out.write("              <svg viewBox=\"0 0 451.847 451.847\"><path d=\"M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n");
      out.write("c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n");
      out.write("c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("            <span class=\"sr-only\">\n");
      out.write("              <svg viewBox=\"0 0 451.847 451.847\"><path d=\"M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0\n");
      out.write("c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744\n");
      out.write("c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <a class=\"u-absolute-vcenter u-carousel-control u-carousel-control-next u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-carousel-control-2\" href=\"#carousel-e131\" role=\"button\" data-u-slide=\"next\">\n");
      out.write("            <span aria-hidden=\"true\">\n");
      out.write("              <svg viewBox=\"0 0 451.846 451.847\"><path d=\"M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n");
      out.write("L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n");
      out.write("c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("            <span class=\"sr-only\">\n");
      out.write("              <svg viewBox=\"0 0 451.846 451.847\"><path d=\"M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744\n");
      out.write("L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284\n");
      out.write("c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("     ");
      out.write("\n");
      out.write("     \n");
      out.write("      ");
      out.write("\n");
      out.write("    <section class=\"u-clearfix u-section-2\" id=\"sec-a7d7\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\"><!--blog--><!--blog_options_json--><!--{\"type\":\"Recent\",\"source\":\"\",\"tags\":\"\",\"count\":\"\"}--><!--/blog_options_json-->\n");
      out.write("        <div class=\"u-blog u-expanded-width u-blog-1\">\n");
      out.write("          <div class=\"u-repeater u-repeater-1\"><!--blog_post-->\n");
      out.write("              \n");
      out.write("            \n");
      out.write("              ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div><!--/blog-->\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("       ");
      out.write("\n");
      out.write("         ");
      out.write("\n");
      out.write("    <section class=\"u-align-center u-clearfix u-section-3\" id=\"sec-231c\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <h2 class=\"u-text u-text-1\">Featured Courses</h2>\n");
      out.write("        <p class=\"u-text u-text-2\">Sample text. Click to select the text box. Click again or double click to start editing the text.</p>\n");
      out.write("        <div class=\"u-expanded-width u-gallery u-layout-grid u-lightbox u-show-text-on-hover u-gallery-1\">\n");
      out.write("          <div class=\"u-gallery-inner u-gallery-inner-1\">\n");
      out.write("              ");
      out.write("\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            ");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("      ");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("   \n");
      out.write("  </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSlider}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("slider");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("   \n");
          out.write("                  ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slider.sliderID==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <div class=\"u-active u-carousel-item u-gallery-item u-carousel-item-1\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"images/64b9d9a44015348cd26b8a76ab4614cbf6204d06308b34582aca38f7e7a6852c004685b6de2d601953e74c2601ba06fd61e74d1445a7491fa4ba6a_1280.jpg\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-over-slide-1\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">Sample Title</h3>\n");
        out.write("                <p class=\"u-gallery-text\">Sample Text</p>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slider.sliderID==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                       <div class=\"u-carousel-item u-gallery-item u-carousel-item-2\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"images/f814e757e81643899e2471a8466fa2e9da3aa470d242dec7a15acaa67c3385291d4fb7dc4fd100dffc8b5d76059e11d27b9e8cf3c2ac4b281acd0e_1280.jpg\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-over-slide-2\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">Sample Title</h3>\n");
        out.write("                <p class=\"u-gallery-text\">Sample Text</p>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${slider.sliderID==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                       <div class=\"u-carousel-item u-gallery-item u-carousel-item-3\" data-image-width=\"2836\" data-image-height=\"1875\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"images/05a4691a6a8c25443fe1afa9d68b7179c22479d624700180d397afca4e2dd80884ac2697d045f256d4e1354076c4c38e9ca340e9004a5c9d6dcad5_1280.jpg\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-over-slide-3\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">Title 1</h3>\n");
        out.write("                <p class=\"u-gallery-text\">Sample Text</p>\n");
        out.write("              </div>\n");
        out.write("              \n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list2Post}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("blog");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("            \n");
          out.write("            ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.blogID==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <div class=\"u-blog-post u-container-style u-repeater-item\">\n");
        out.write("              <div class=\"u-container-layout u-similar-container u-container-layout-1\"><!--blog_post_header-->\n");
        out.write("                <h2 class=\"u-blog-control u-text\">\n");
        out.write("                  <a class=\"u-post-header-link\" href=\"blog/post.html\"><!--blog_post_header_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_header_content--></a>\n");
        out.write("                </h2><!--/blog_post_header-->\n");
        out.write("                <a class=\"u-post-header-link\" href=\"blog/post.html\"><!--blog_post_image-->\n");
        out.write("                  <img alt=\"\" class=\"u-blog-control u-expanded-width u-image u-image-default u-image-1\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><!--/blog_post_image-->\n");
        out.write("                </a><!--blog_post_content-->\n");
        out.write("                <div class=\"u-blog-control u-post-content u-text u-text-2\"><!--blog_post_content_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_content_content--></div><!--/blog_post_content--><!--blog_post_metadata-->\n");
        out.write("                <div class=\"u-blog-control u-metadata u-metadata-1\"><!--blog_post_metadata_date-->\n");
        out.write("                  <span class=\"u-meta-date u-meta-icon\"><!--blog_post_metadata_date_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.updatedDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_metadata_date_content--></span><!--/blog_post_metadata_date-->\n");
        out.write("                </div><!--/blog_post_metadata--><!--blog_post_readmore-->\n");
        out.write("                <a href=\"blog/post.html\" class=\"u-active-none u-blog-control u-border-2 u-border-palette-1-base u-btn u-btn-rectangle u-button-style u-hover-none u-none u-btn-1\"><!--blog_post_readmore_content--><!--options_json--><!--{\"content\":\"\"}--><!--/options_json-->Read More<!--/blog_post_readmore_content--></a><!--/blog_post_readmore-->\n");
        out.write("              </div>\n");
        out.write("            </div><!--/blog_post--><!--blog_post-->\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.blogID==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                \n");
        out.write("            <div class=\"u-blog-post u-container-style u-repeater-item\">\n");
        out.write("              <div class=\"u-container-layout u-similar-container u-container-layout-2\"><!--blog_post_header-->\n");
        out.write("                <h2 class=\"u-blog-control u-text\">\n");
        out.write("                  <a class=\"u-post-header-link\" href=\"blog/post-1.html\"><!--blog_post_header_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_header_content--></a>\n");
        out.write("                </h2><!--/blog_post_header-->\n");
        out.write("                <a class=\"u-post-header-link\" href=\"blog/post-1.html\"><!--blog_post_image-->\n");
        out.write("                  <img alt=\"\" class=\"u-blog-control u-expanded-width u-image u-image-default u-image-2\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" data-image-width=\"1280\" data-image-height=\"853\"><!--/blog_post_image-->\n");
        out.write("                </a><!--blog_post_content-->\n");
        out.write("                <div class=\"u-blog-control u-post-content u-text u-text-4\"><!--blog_post_content_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_content_content--></div><!--/blog_post_content--><!--blog_post_metadata-->\n");
        out.write("                <div class=\"u-blog-control u-metadata u-metadata-2\"><!--blog_post_metadata_date-->\n");
        out.write("                  <span class=\"u-meta-date u-meta-icon\"><!--blog_post_metadata_date_content-->");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.updatedDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<!--/blog_post_metadata_date_content--></span><!--/blog_post_metadata_date-->\n");
        out.write("                </div><!--/blog_post_metadata--><!--blog_post_readmore-->\n");
        out.write("                <a href=\"blog/post-1.html\" class=\"u-active-none u-blog-control u-border-2 u-border-palette-1-base u-btn u-btn-rectangle u-button-style u-hover-none u-none u-btn-2\"><!--blog_post_readmore_content--><!--options_json--><!--{\"content\":\"\"}--><!--/options_json-->Read More<!--/blog_post_readmore_content--></a><!--/blog_post_readmore-->\n");
        out.write("              </div>\n");
        out.write("            </div><!--/blog_post-->    \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSubject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("subject");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                   ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("           \n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='ASSL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("                          <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                            <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                          </div>\n");
        out.write("                          <div class=\"u-over-slide u-shading u-over-slide-1\">\n");
        out.write("                            <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                            <p class=\"u-gallery-text\"></p>\n");
        out.write("                          </div>\n");
        out.write("                        </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='ITE302c'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("                          <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                            <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                          </div>\n");
        out.write("                          <div class=\"u-over-slide u-shading u-over-slide-1\">\n");
        out.write("                            <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                            <p class=\"u-gallery-text\"></p>\n");
        out.write("                          </div>\n");
        out.write("                        </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='SDE101'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("                            <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"853\">\n");
        out.write("                             <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                         </div>\n");
        out.write("                        <div class=\"u-over-slide u-shading u-over-slide-3\">\n");
        out.write("                        <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                         <p class=\"u-gallery-text\"></p>\n");
        out.write("                        </div>\n");
        out.write("                        </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='SSL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"960\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-shading u-over-slide-4\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                <p class=\"u-gallery-text\"></p>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='SWE201'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"150\" data-image-height=\"100\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-shading u-over-slide-5\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                <p class=\"u-gallery-text\"></p>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.subjectID=='WED102'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <div class=\"u-effect-fade u-gallery-item\">\n");
        out.write("              <div class=\"u-back-slide\" data-image-width=\"1280\" data-image-height=\"830\">\n");
        out.write("                <img class=\"u-back-image u-expanded\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("              </div>\n");
        out.write("              <div class=\"u-over-slide u-shading u-over-slide-6\">\n");
        out.write("                <h3 class=\"u-gallery-heading\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                <p class=\"u-gallery-text\"></p>\n");
        out.write("              </div>\n");
        out.write("            </div>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }
}
