/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2022-05-14 10:19:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Complain;

public final class Complain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.Complain");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Unit Service</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Views/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Views/complains.css\">\r\n");
      out.write("<script src=\"Components/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"Components/Complain.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url(https://wallpaperaccess.com/full/5227230.png)\">\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write(" <div class=\"col-6\">\r\n");
      out.write("\r\n");
      out.write("<h1>Complain Management</h1>\r\n");
      out.write("<form id=\"formComplains\" name=\"formComplains\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("    Customer Name:\r\n");
      out.write("\t<input id=\"perName\" name=\"perName\" type=\"text\" class=\"form-control form-control-sm\">\r\n");
      out.write("\t<br>  \r\n");
      out.write("\tCustomer Account Number:\r\n");
      out.write("\t<input id=\"cAccNo\" name=\"cAccNo\" type=\"text\" class=\"form-control form-control-sm\">\r\n");
      out.write("\t<br> \r\n");
      out.write("\tComplain Area:\r\n");
      out.write("\t<input id=\"cArea\" name=\"cArea\" type=\"text\" class=\"form-control form-control-sm\">\r\n");
      out.write("\t<br> \r\n");
      out.write("    Phone Number:\r\n");
      out.write("    <input id=\"cPhone\" name=\"cPhone\" type=\"text\" class=\"form-control form-control-sm\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\tComplain:\r\n");
      out.write("    <input id=\"comp\" name=\"comp\" type=\"text\" class=\"form-control form-control-sm\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input id=\"btnSave\" name=\"btnSave\" type=\"button\" value=\"Save\" class=\"btn btn-primary\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"hidComplainIDSave\" name=\"hidComplainIDSave\" value=\"\">\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"alertSuccess\" class=\"alert alert-success\"></div>\r\n");
      out.write("<div id=\"alertError\" class=\"alert alert-danger\"></div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"divComplainsGrid\">\r\n");
      out.write("\t ");

	 	Complain complains = new Complain();
	 	out.print(complains.readComplains());
	 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
