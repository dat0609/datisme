package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>The Collector - Dashboard</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("                <!-- Sidebar - Brand -->\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">SB Admin <sup>2</sup></div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Dashboard -->\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                        <span>Dashboard</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                <!-- Heading -->\n");
      out.write("                <div class=\"sidebar-heading\">\n");
      out.write("                    Interface\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Utilities Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\n");
      out.write("                       aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("                        <i class=\"fas fa-fw fa-wrench\"></i>\n");
      out.write("                        <span>Utilities</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
      out.write("                         data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Custom Utilities:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"add-product\">Add Product</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"update-product\">Update Product</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                <!-- Heading -->\n");
      out.write("                <div class=\"sidebar-heading\">\n");
      out.write("                    Addons\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\n");
      out.write("                       aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Pages</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Login Screens:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"login\">Login</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"register\">Register</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"forgot-password\">Forgot Password</a>\n");
      out.write("                            <div class=\"collapse-divider\"></div>\n");
      out.write("                            <h6 class=\"collapse-header\">Other Pages:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"error.jsp\">404 Page</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    ");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Search -->\n");
      out.write("                        <form\n");
      out.write("                            class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\n");
      out.write("                                       aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                        <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Navbar -->\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"searchDropdown\">\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                                                   placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                                                   aria-describedby=\"basic-addon2\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - User Information -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"logout\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </nav>");
      out.write("\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <!-- Page Heading -->\n");
      out.write("                        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("                            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i\n");
      out.write("                                    class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Content Row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-success shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">\n");
      out.write("                                                    Earnings (Annual)</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                            \n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">\n");
      out.write("                                                    Total Products</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.totalProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-calendar fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-info text-uppercase mb-1\">Total Users\n");
      out.write("                                                </div>\n");
      out.write("                                                <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.totalUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-clipboard-list fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Pending Requests Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-warning shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\">\n");
      out.write("                                                    View Count</div>\n");
      out.write("                                                <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.viewCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Content Row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!-- Area Chart -->\n");
      out.write("                            <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("                                <div class=\"card shadow mb-4\">\n");
      out.write("                                    <!-- Card Header - Dropdown -->\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Product Overview</h6>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <table class=\"table table-bordered\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"col\">Product ID</th>\n");
      out.write("                                                <th scope=\"col\">Name</th>\n");
      out.write("                                                <th scope=\"col\">Price</th>\n");
      out.write("                                                <th scope=\"col\">Quantity</th>\n");
      out.write("                                                <th scope=\"col\">Description</th>\n");
      out.write("                                                <th scope=\"col\">Status</th>\n");
      out.write("                                                <th scope=\"col\">Image</th>\n");
      out.write("                                                <th scope=\"col\">Action</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                        \n");
      out.write("                                    <nav aria-label=\"...\" class=\"d-flex justify-content-center\">\n");
      out.write("                                        <ul class=\"pagination pagination-lg\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Pie Chart -->\n");
      out.write("                            <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("                                <div class=\"card shadow mb-4\">\n");
      out.write("                                    <!-- Card Header - Dropdown -->\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Best Seller</h6>\n");
      out.write("                                        <div class=\"dropdown no-arrow\">\n");
      out.write("                                            <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\"\n");
      out.write("                                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Card Body -->\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"chart-pie pt-4 pb-2\">\n");
      out.write("                                            <canvas id=\"myPieChart\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\n");
      out.write("                    <div class=\"container my-auto\">\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\n");
      out.write("                            <span>Copyright &copy; Your Website 2020</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- End of Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Scroll to Top Button-->\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Logout Modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("             aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"logout\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugins -->\n");
      out.write("        <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level custom scripts -->\n");
      out.write("        <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <form action=\"update-product\">\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <input type=\"hidden\" name=\"productId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td><input type=\"text\" size=\"10\" name=\"name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("                                                    <td><input type=\"text\" size=\"8\" name=\"price\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("                                                    <td><input type=\"text\" size=\"2\" name=\"quantity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("                                                    <td style=\"size: 5px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td><input type=\"text\" size=\"1\" name=\"status\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("                                                    <td><img class=\"card-img-top\" src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"5\" height=\"100\" alt=\"\"></td>\n");
          out.write("                                                    <td><a href=\"update-product?product=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a></td>\n");
          out.write("                                                </tr>\n");
          out.write("                                                </form>\n");
          out.write("                                            ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                                ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                            ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PageIndex == i}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <li class=\"page-item active\" aria-current=\"page\">\n");
        out.write("                                                            <span class=\"page-link\">\n");
        out.write("                                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                <span class=\"sr-only\">(current)</span>\n");
        out.write("                                                            </span>\n");
        out.write("                                                        </li>\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
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
        out.write("                                                        <li class=\"page-item\"><a class=\"page-link\" href=\"admin?pageIndex=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                                                        ");
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
}
