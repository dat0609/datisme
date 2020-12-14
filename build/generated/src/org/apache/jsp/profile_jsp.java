package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/profile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>\n");
      out.write("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>\n");
      out.write("<link href='https://cdnjs.cloudflare.com/ajax/libs/MaterialDesign-Webfont/3.6.95/css/materialdesignicons.css'>\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("<div class=\"page-content page-container\" id=\"page-content\">\n");
      out.write("    <div class=\"padding\">\n");
      out.write("        <div class=\"row container d-flex justify-content-center\">\n");
      out.write("            <div class=\"col-xl-6 col-md-12\">\n");
      out.write("                <div class=\"card user-card-full\">\n");
      out.write("                    <div class=\"row m-l-0 m-r-0\">\n");
      out.write("                        <div class=\"col-sm-4 bg-c-lite-green user-profile\">\n");
      out.write("                            <div class=\"card-block text-center text-white\">\n");
      out.write("                                <div class=\"m-b-25\"> <img src=\"https://img.icons8.com/bubbles/100/000000/user.png\" class=\"img-radius\" alt=\"User-Profile-Image\"> </div>\n");
      out.write("                                <h6 class=\"f-w-600\">Hembo Tingor</h6>\n");
      out.write("                                <p>Web Designer</p> <i class=\" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <div class=\"card-block\">\n");
      out.write("                                <h6 class=\"m-b-20 p-b-5 b-b-default f-w-600\">Information</h6>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <p class=\"m-b-10 f-w-600\">Email</p>\n");
      out.write("                                        <h6 class=\"text-muted f-w-400\">rntng@gmail.com</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <p class=\"m-b-10 f-w-600\">Phone</p>\n");
      out.write("                                        <h6 class=\"text-muted f-w-400\">98979989898</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 class=\"m-b-20 m-t-40 p-b-5 b-b-default f-w-600\">Projects</h6>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <p class=\"m-b-10 f-w-600\">Recent</p>\n");
      out.write("                                        <h6 class=\"text-muted f-w-400\">Sam Disuja</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <p class=\"m-b-10 f-w-600\">Most Viewed</p>\n");
      out.write("                                        <h6 class=\"text-muted f-w-400\">Dinoter husainm</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <ul class=\"social-link list-unstyled m-t-40 m-b-10\">\n");
      out.write("                                    <li><a href=\"#!\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"\" data-original-title=\"facebook\" data-abc=\"true\"><i class=\"mdi mdi-facebook feather icon-facebook facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#!\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"\" data-original-title=\"twitter\" data-abc=\"true\"><i class=\"mdi mdi-twitter feather icon-twitter twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#!\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"\" data-original-title=\"instagram\" data-abc=\"true\"><i class=\"mdi mdi-instagram feather icon-instagram instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
