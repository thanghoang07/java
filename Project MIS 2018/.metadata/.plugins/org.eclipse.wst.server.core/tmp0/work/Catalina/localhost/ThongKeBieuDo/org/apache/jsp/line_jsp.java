/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.37
 * Generated at: 2018-05-22 08:56:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdk.nashorn.internal.ir.Labels;
import dao.ThongKeSoLuongDonHang;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public final class line_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("jdk.nashorn.internal.ir.Labels");
    _jspx_imports_classes.add("dao.ThongKeSoLuongDonHang");
    _jspx_imports_classes.add("java.util.ArrayList");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Thong ke bieu do</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://www.chartjs.org/dist/2.7.2/Chart.bundle.js\"></script>\r\n");
      out.write("<style type=\"text/css\">/* Chart.js */\r\n");
      out.write("@-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}</style>\r\n");
      out.write("<style>\r\n");
      out.write("\tcanvas{\r\n");
      out.write("\t\t-moz-user-select: none;\r\n");
      out.write("\t\t-webkit-user-select: none;\r\n");
      out.write("\t\t-ms-user-select: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

	
		ThongKeSoLuongDonHang tk = new ThongKeSoLuongDonHang();
	
		List<String> listMaDonHang = new ArrayList<String>();
		
		listMaDonHang = tk.layMAKH();
		
		List<Integer> listSoLuongDonHang = new ArrayList<Integer>();
		
		for (String makh : listMaDonHang) {
			int soluong = tk.thongKeDonHangTheoDanhSachMKH(makh);
			listSoLuongDonHang.add(soluong);
		}
		
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width:75%;\">\r\n");
      out.write("\t\t<div class=\"chartjs-size-monitor\" style=\"position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;\"><div class=\"chartjs-size-monitor-expand\" style=\"position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;\"><div style=\"position:absolute;width:1000000px;height:1000000px;left:0;top:0\"></div></div><div class=\"chartjs-size-monitor-shrink\" style=\"position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;\"><div style=\"position:absolute;width:200%;height:200%;left:0; top:0\"></div></div></div>\r\n");
      out.write("\t\t<canvas id=\"myChart\" width=\"596\" height=\"298\" class=\"chartjs-render-monitor\" style=\"display: block; width: 596px; height: 298px;\"></canvas>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tvar soLuongDonHang = ");
      out.print( listSoLuongDonHang );
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\tvar makh = ");
      out.print( listMaDonHang );
      out.write(";\t\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar ctx = document.getElementById('myChart').getContext('2d');\r\n");
      out.write("\tvar chart = new Chart(ctx, {\r\n");
      out.write("\t    // The type of chart we want to create\r\n");
      out.write("\t    type: 'bar',\r\n");
      out.write("\r\n");
      out.write("\t    // The data for our dataset\r\n");
      out.write("\t    data: {\r\n");
      out.write("\t        labels: makh,\r\n");
      out.write("\t        datasets: [{\r\n");
      out.write("\t            label: \"Số lượng đơn hàng\",\r\n");
      out.write("\t            backgroundColor: 'rgb(255, 0, 10)',\r\n");
      out.write("\t            borderColor: 'rgb(255, 0, 10)',\r\n");
      out.write("\t            data: soLuongDonHang,\r\n");
      out.write("\t        }\r\n");
      out.write("\t        ]\r\n");
      out.write("\t    },\r\n");
      out.write("\r\n");
      out.write("\t    options: {\r\n");
      out.write("\t\t\tresponsive: true,\r\n");
      out.write("\t\t\ttitle: {\r\n");
      out.write("\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\ttext: 'Chart.js Line Chart'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltips: {\r\n");
      out.write("\t\t\t\tmode: 'index',\r\n");
      out.write("\t\t\t\tintersect: false,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\thover: {\r\n");
      out.write("\t\t\t\tmode: 'nearest',\r\n");
      out.write("\t\t\t\tintersect: true\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tscales: {\r\n");
      out.write("\t\t\t\txAxes: [{\r\n");
      out.write("\t\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\t\tscaleLabel: {\r\n");
      out.write("\t\t\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\t\t\tlabelString: 'Month'\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}],\r\n");
      out.write("\t\t\t\tyAxes: [{\r\n");
      out.write("\t\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\t\tscaleLabel: {\r\n");
      out.write("\t\t\t\t\t\tdisplay: true,\r\n");
      out.write("\t\t\t\t\t\tlabelString: 'Value'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tticks: {\r\n");
      out.write("\t\t\t\t\t\tmin: 0,\r\n");
      out.write("\t\t\t\t\t\tmax: 100,\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// forces step size to be 5 units\r\n");
      out.write("\t\t\t\t\t\tstepSize: 5\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
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
