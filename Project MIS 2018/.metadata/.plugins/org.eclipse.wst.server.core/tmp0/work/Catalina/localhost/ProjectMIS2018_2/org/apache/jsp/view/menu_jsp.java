/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.37
 * Generated at: 2018-05-22 09:26:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.LoaiHang;
import dao.QuanLyLoaiHangDAO;
import dao.IQuanLyLoaiHang;
import model.LoaiNhanSu;
import model.LoaiHang;
import java.util.ArrayList;
import dao.QuanLyNhanSuDAO;
import dao.IQuanLyNhanSu;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("model.LoaiHang");
    _jspx_imports_classes.add("dao.QuanLyLoaiHangDAO");
    _jspx_imports_classes.add("dao.QuanLyNhanSuDAO");
    _jspx_imports_classes.add("dao.IQuanLyLoaiHang");
    _jspx_imports_classes.add("model.LoaiNhanSu");
    _jspx_imports_classes.add("dao.IQuanLyNhanSu");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Trang tổng quan</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"../css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Morris Charts CSS -->\r\n");
      out.write("    <link href=\"../css/plugins/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"../font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"../index.jsp\">MIS Shop Admin</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Top Menu Items -->\r\n");
      out.write("            <ul class=\"nav navbar-right top-nav\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu message-dropdown\">\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"E:\\Admin-SB-v2\\SB-Admin-2-master\\img\\sms.png\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Hoàng Vũ</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Hôm qua lúc 4:32 PM</p>\r\n");
      out.write("                                        <p>Hôm qua bạn có một tin nhắn từ...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"E:\\Admin-SB-v2\\SB-Admin-2-master\\img\\sms.png\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Hoàng Vũ</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Hôm qua lúc 4:32 PM</p>\r\n");
      out.write("                                        <p>Hôm qua bạn có một tin nhắn từ...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"E:\\Admin-SB-v2\\SB-Admin-2-master\\img\\sms.png\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Hoàng Vũ</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Hôm qua lúc 4:32 PM</p>\r\n");
      out.write("                                        <p>Hôm qua bạn có một tin nhắn từ từ...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-footer\">\r\n");
      out.write("                            <a href=\"#\">Xem tất cả tin nhắn</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu alert-dropdown\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-default\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-primary\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-success\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-info\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-warning\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Bạn có đơn hàng từ <span class=\"label label-danger\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Xem tất cả</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Hoàng Vũ <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Trang cá nhân</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Hộp thư</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Cài đặt</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Đăng xuất</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"../index.jsp\"><i class=\"fa fa-fw fa-dashboard\"></i> Tổng quan</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"charts.jsp\"><i class=\"fa fa-fw fa-bar-chart-o\"></i> Thống kê chi tiết</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"tables.jsp\"><i class=\"fa fa-fw fa-table\"></i> Đơn hàng</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"khachhang.jsp\"><i class=\"fa fa-fw fa-table\"></i> Khách hàng</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo\"><i class=\"fa fa-fw fa-table\"></i> Sản Phẩm <i class=\"fa fa-fw fa-caret-down\"></i></a>\r\n");
      out.write("                        <ul id=\"demo\" class=\"collapse\">\r\n");
      out.write("                        ");

                        	IQuanLyLoaiHang qllh = new QuanLyLoaiHangDAO();
                                                                                                                        
                                                                                                                        	ArrayList<LoaiHang> listLoaiHang = new ArrayList<LoaiHang>();
                                                                                                                        
                                                                                                                        	listLoaiHang = qllh.getList();
                                                                                                                        	
                                                                                                                        	for (LoaiHang lh : listLoaiHang) {
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"quanlysanpham.jsp?ma_loaihang=");
      out.print(lh.getMa_loaihang());
      out.write('"');
      out.write('>');
      out.print(lh.getTen_loaihang());
      out.write("</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                            ");

                                                        	}
                                                        
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#demo1\"><i class=\"fa fa-fw fa-table\"></i> Nhân sự <i class=\"fa fa-fw fa-caret-down\"></i></a>\r\n");
      out.write("                        <ul id=\"demo1\" class=\"collapse\">\r\n");
      out.write("                        ");

                        	IQuanLyNhanSu ql = new QuanLyNhanSuDAO();
                                                				
                                                					ArrayList<LoaiNhanSu> listLoaiNhanSu = new ArrayList<LoaiNhanSu>();
                                                					
                                                					listLoaiNhanSu = ql.getList();
                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

                        	
                        		for (LoaiNhanSu lns : listLoaiNhanSu) {
                        	
                        	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"quanlynhansu.jsp?ma_loains=");
      out.print( lns.getMa_loains() );
      out.write('"');
      out.write('>');
      out.print( lns.getTen_loains() );
      out.write("</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                            ");

                            
                        		}
                            
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"nguyen-lieu.jsp\"><i class=\"fa fa-fw fa-table\"></i> Nguyên liệu</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"cham-cong.jsp\"><i class=\"fa fa-fw fa-table\"></i> Chấm công</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("                        <a href=\"bootstrap-grid.html\"><i class=\"fa fa-fw fa-wrench\"></i> Cài đặt</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery Version 1.11.0 -->\r\n");
      out.write("    <script src=\"../js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Morris Charts JavaScript -->\r\n");
      out.write("    <script src=\"../js/plugins/morris/raphael.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/plugins/morris/morris.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/plugins/morris/morris-data.js\"></script>\r\n");
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