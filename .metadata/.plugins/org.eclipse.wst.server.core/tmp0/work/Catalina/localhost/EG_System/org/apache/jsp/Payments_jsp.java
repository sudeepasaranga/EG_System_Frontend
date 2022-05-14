/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2022-05-14 14:32:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Payment;

public final class Payments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.Payment");
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Payment Service</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Views/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Views/payments.css\">\r\n");
      out.write("<script src=\"Components/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"Components/payments.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url(https://png.pngtree.com/thumb_back/fh260/back_our/20190628/ourmid/pngtree-white-lines-pink-background-image_269454.jpg\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write(" <div class=\"col-6\">\r\n");
      out.write("\r\n");
      out.write("<h1><b>Payment Management</b></h1>\r\n");
      out.write("<h4>Add New Payment Details</h4>\r\n");
      out.write("<form id=\"formPayments\" name=\"formPayments\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t Date Of Payment:\r\n");
      out.write("\t<input id=\"dateOfpay\" name=\"dateOfpay\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Enter date of payment\">\r\n");
      out.write("\t<br> Payment Method:\r\n");
      out.write("\t<input id=\"payMethod\" name=\"payMethod\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Enter payment method\">\r\n");
      out.write("\t<br> CardHolder Name:\r\n");
      out.write("\t<input id=\"cardHolder\" name=\"cardHolder\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Enter cardholder name\">\r\n");
      out.write("\t<br> Card Number:\r\n");
      out.write("\t<input id=\"cardNo\" name=\"cardNo\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Enter card number\">\r\n");
      out.write("\t<br> CVV:\r\n");
      out.write("\t<input id=\"cvv\" name=\"cvv\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"CVV\">\r\n");
      out.write("\t<br> Expiration Date:\r\n");
      out.write("\t<input id=\"expDate\" name=\"expDate\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Expiration date\">\r\n");
      out.write("\t<br> Total Amount:\r\n");
      out.write("\t<input id=\"totamount\" name=\"totamount\" type=\"text\" class=\"form-control form-control-sm\" placeholder=\"Total amount\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input id=\"btnSave\" name=\"btnSave\" type=\"button\" value=\"Save\" class=\"btn btn-primary\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"hidPaymentIdSave\" name=\"hidPaymentIdSave\" value=\"\">\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"alertSuccess\" class=\"alert alert-success\"></div>\r\n");
      out.write("<div id=\"alertError\" class=\"alert alert-danger\"></div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<h4>All Payments Details</h4>\r\n");
      out.write("<div id=\"divPaymentsGrid\">\r\n");
      out.write("\t ");

	 	Payment payment = new Payment();
	 	out.print(payment.readPayment());
	 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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