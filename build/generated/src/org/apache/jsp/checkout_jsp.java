package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Shop Homepage - Start Bootstrap Template</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navigation -->\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"home\">The Collector</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"home\">Home\n");
      out.write("                        <span class=\"sr-only\">(current)</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"cart\">Cart</a>\n");
      out.write("                </li>\n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        <!--container-->\n");
      out.write("        <div class=\"container\" style=\"margin-top: 5rem\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\" style=\"border: 1px solid #ced4da;border-radius: 5px !important\">\n");
      out.write("                    <h4 class=\"mt-3\">List of Product</h4>\n");
      out.write("                    <table class=\"w-100 table table-striped mt-3\">   \n");
      out.write("                        <tr>\n");
      out.write("                            <th>STT</th>\n");
      out.write("                            <th>Image</th>\n");
      out.write("                            <th>Name of Product</th>\n");
      out.write("                            <th>Price</th>\n");
      out.write("                            <th>Quantity</th>\n");
      out.write("                            <th>Total Price</th>\n");
      out.write("                        </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>1</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Product Name</td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>2</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Product Name</td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>3</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img src=\"images/1.jpg\" style=\"width: 100px\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>Product Name</td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"number\" min=\"1\" max=\"20\" value=\"1\" class=\"pl-1\" style=\"width: 60px\"/>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_formatNumber_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-danger\"><i class=\"fas fa-trash\"></i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <hr/>\n");
      out.write("                    <div class=\"text-right\">\n");
      out.write("                        <h4>Total price:");
      if (_jspx_meth_fmt_formatNumber_6(_jspx_page_context))
        return;
      out.write("</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 pl-5\" style=\"border: 1px solid #ced4da;border-radius: 5px !important;\">\n");
      out.write("                    <h3 class=\"mt-3\" style=\"color: orange\">Infomation of Customer</h3>\n");
      out.write("                    <div class=\"card mt-3\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form action=\"checkout\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\">Full Name</label>\n");
      out.write("                                    <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Enter name\" required>\n");
      out.write("                                    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"sdt\">Phone number</label>\n");
      out.write("                                    <input type=\"number\" name=\"mobile\" class=\"form-control\" placeholder=\"enter phone number\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"address\">Address</label>\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" name=\"address\" required></textarea>\n");
      out.write("                                </div><div class=\"form-group\">\n");
      out.write("                                    <label for=\"address\">Note</label>\n");
      out.write("                                    <textarea class=\"form-control\" rows=\"3\" name=\"note\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success w-100\">Accept</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      out.write("  <footer class=\"py-5 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2020</p>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </footer>");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"profile\">Profile</a>\n");
        out.write("                        </li>\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"logout\">Logout</a>\n");
        out.write("                        </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"login\">Login</a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setValue(new String("50"));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent(null);
    _jspx_th_fmt_formatNumber_1.setType("currency");
    _jspx_th_fmt_formatNumber_1.setValue(new String("100"));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent(null);
    _jspx_th_fmt_formatNumber_2.setType("currency");
    _jspx_th_fmt_formatNumber_2.setValue(new String("50"));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent(null);
    _jspx_th_fmt_formatNumber_3.setType("currency");
    _jspx_th_fmt_formatNumber_3.setValue(new String("100"));
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_4.setParent(null);
    _jspx_th_fmt_formatNumber_4.setType("currency");
    _jspx_th_fmt_formatNumber_4.setValue(new String("50"));
    int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
    if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_5.setParent(null);
    _jspx_th_fmt_formatNumber_5.setType("currency");
    _jspx_th_fmt_formatNumber_5.setValue(new String("100"));
    int _jspx_eval_fmt_formatNumber_5 = _jspx_th_fmt_formatNumber_5.doStartTag();
    if (_jspx_th_fmt_formatNumber_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_5);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_5);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_6.setParent(null);
    _jspx_th_fmt_formatNumber_6.setType("currency");
    _jspx_th_fmt_formatNumber_6.setValue(new String("100"));
    int _jspx_eval_fmt_formatNumber_6 = _jspx_th_fmt_formatNumber_6.doStartTag();
    if (_jspx_th_fmt_formatNumber_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_6);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_6);
    return false;
  }
}
