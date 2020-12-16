package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Add Product - Dashboard HTML Template</title>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\n");
      out.write("    />\n");
      out.write("    <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\n");
      out.write("    <!-- https://fontawesome.com/ -->\n");
      out.write("    <link href=\"vendor/jquery/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"vendor/jquery/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- http://api.jqueryui.com/datepicker/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("    <!--\n");
      out.write("\tProduct Admin CSS Template\n");
      out.write("\thttps://templatemo.com/tm-524-product-admin\n");
      out.write("\t-->\n");
      out.write("       \n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("    <div class=\"container tm-mt-big tm-mb-big\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-9 col-lg-8 col-md-12 col-sm-8 mx-auto\">\n");
      out.write("          <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-6\">\n");
      out.write("                  \n");
      out.write("                <h1 class=\"tm-block-title d-inline-block\">Update Product</h1>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row tm-edit-product-row\">\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12\">\n");
      out.write("                  <form action=\"add-product\" class=\"tm-edit-product-form\" method=\"post\">\n");
      out.write("                  <div class=\"form-group mb-3\">\n");
      out.write("                    <label\n");
      out.write("                      for=\"name\"\n");
      out.write("                      >Product Name\n");
      out.write("                    </label>\n");
      out.write("                    <input\n");
      out.write("                      id=\"name\"\n");
      out.write("                      name=\"name\"\n");
      out.write("                      type=\"text\"\n");
      out.write("                      class=\"form-control validate\"\n");
      out.write("                      required\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group mb-3\">\n");
      out.write("                    <label\n");
      out.write("                      for=\"name\"\n");
      out.write("                      >Product Price\n");
      out.write("                    </label>\n");
      out.write("                    <input\n");
      out.write("                      id=\"name\"\n");
      out.write("                      name=\"price\"\n");
      out.write("                      type=\"text\"\n");
      out.write("                      class=\"form-control validate\"\n");
      out.write("                      required\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                  <div class=\"form-group mb-3\">\n");
      out.write("                    <label\n");
      out.write("                      for=\"description\"\n");
      out.write("                      >Description</label\n");
      out.write("                    >\n");
      out.write("                    <textarea\n");
      out.write("                        name=\"description\"\n");
      out.write("                      class=\"form-control validate\"\n");
      out.write("                      rows=\"3\"\n");
      out.write("                      required\n");
      out.write("                    ></textarea>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                      <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\n");
      out.write("                          <label\n");
      out.write("                            for=\"expire_date\"\n");
      out.write("                            >Quantity\n");
      out.write("                          </label>\n");
      out.write("                          <input\n");
      out.write("                            id=\"expire_date\"\n");
      out.write("                            name=\"quantity\"\n");
      out.write("                            type=\"number\"\n");
      out.write("                            class=\"form-control validate\"\n");
      out.write("                            data-large-mode=\"true\"\n");
      out.write("                          />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\n");
      out.write("                          <label\n");
      out.write("                            for=\"stock\"\n");
      out.write("                            >Status\n");
      out.write("                          </label>\n");
      out.write("                          <input\n");
      out.write("                            id=\"stock\"\n");
      out.write("                            name=\"status\"\n");
      out.write("                            type=\"text\"\n");
      out.write("                            class=\"form-control validate\"\n");
      out.write("                            required\n");
      out.write("                          />\n");
      out.write("                        </div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\n");
      out.write("                <div class=\"tm-product-img-dummy mx-auto\">\n");
      out.write("                  <i\n");
      out.write("                    class=\"fas fa-cloud-upload-alt tm-upload-icon\"\n");
      out.write("                    onclick=\"document.getElementById('fileInput').click();\"\n");
      out.write("                  ></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"custom-file mt-3 mb-3\">\n");
      out.write("                    <input id=\"fileInput\" type=\"file\" name=\"file\" style=\"display:none;\" />\n");
      out.write("                  <input\n");
      out.write("                    type=\"button\"\n");
      out.write("                    class=\"btn btn-primary btn-block mx-auto\"\n");
      out.write("                    value=\"UPLOAD PRODUCT IMAGE\"\n");
      out.write("                    onclick=\"document.getElementById('fileInput').click();\"\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-12\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add Product Now</button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("          </div>\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- https://jquery.com/download/ -->\n");
      out.write("    <script src=\"jquery-ui-datepicker/jquery-ui.min.js\"></script>\n");
      out.write("    <!-- https://jqueryui.com/download/ -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <script>\n");
      out.write("      $(function() {\n");
      out.write("        $(\"#expire_date\").datepicker();\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
