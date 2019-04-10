<%@page import="model.LoaiHang"%>
<%@page import="dao.QuanLyLoaiHangDAO"%>
<%@page import="dao.IQuanLyLoaiHang"%>
<%@page import="model.LoaiNhanSu"%>
<%@page import="model.LoaiHang"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.QuanLyNhanSuDAO"%>
<%@page import="dao.IQuanLyNhanSu"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Trang tổng quan</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../index.jsp">MIS Shop Admin</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Hoàng Vũ</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM</p>
                                        <p>Hôm qua bạn có một tin nhắn từ...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Hoàng Vũ</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM</p>
                                        <p>Hôm qua bạn có một tin nhắn từ...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Hoàng Vũ</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM</p>
                                        <p>Hôm qua bạn có một tin nhắn từ từ...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Xem tất cả tin nhắn</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Bạn có đơn hàng từ <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">Xem tất cả</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Hoàng Vũ <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Trang cá nhân</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Hộp thư</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Cài đặt</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Đăng xuất</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="../index.jsp"><i class="fa fa-fw fa-dashboard"></i> Tổng quan</a>
                    </li>
                    <li>
                        <a href="charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Thống kê chi tiết</a>
                    </li>
                    <li>
                        <a href="tables.jsp"><i class="fa fa-fw fa-table"></i> Đơn hàng</a>
                    </li>
                    <li>
                        <a href="khachhang.jsp"><i class="fa fa-fw fa-table"></i> Khách hàng</a>
                    </li>
                    
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-table"></i> Sản Phẩm <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                        <%
                        	IQuanLyLoaiHang qllh = new QuanLyLoaiHangDAO();
                                                                                                                        
                                                                                                                        	ArrayList<LoaiHang> listLoaiHang = new ArrayList<LoaiHang>();
                                                                                                                        
                                                                                                                        	listLoaiHang = qllh.getList();
                                                                                                                        	
                                                                                                                        	for (LoaiHang lh : listLoaiHang) {
                        %>
                        
                            <li>
                                <a href="quanlysanpham.jsp?ma_loaihang=<%=lh.getMa_loaihang()%>"><%=lh.getTen_loaihang()%></a>
                            </li>
                            
                            <%
                                                        	}
                                                        %>
                        </ul>
                    </li>
                    
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo1"><i class="fa fa-fw fa-table"></i> Nhân sự <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo1" class="collapse">
                        <%
                        	IQuanLyNhanSu ql = new QuanLyNhanSuDAO();
                                                				
                                                					ArrayList<LoaiNhanSu> listLoaiNhanSu = new ArrayList<LoaiNhanSu>();
                                                					
                                                					listLoaiNhanSu = ql.getList();
                        %>
						
						<%
                        	
                        		for (LoaiNhanSu lns : listLoaiNhanSu) {
                        	
                        	%>
						
                            <li>
                                <a href="quanlynhansu.jsp?ma_loains=<%= lns.getMa_loains() %>"><%= lns.getTen_loains() %></a>
                            </li>
                            
                            <%
                            
                        		}
                            %>
                        </ul>
                    </li>
                    <li>
                        <a href="nguyen-lieu.jsp"><i class="fa fa-fw fa-table"></i> Nguyên liệu</a>
                    </li>
                    <li>
                        <a href="cham-cong.jsp"><i class="fa fa-fw fa-table"></i> Chấm công</a>
                    </li>
					<li>
                        <a href="bootstrap-grid.html"><i class="fa fa-fw fa-wrench"></i> Cài đặt</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

    <!-- jQuery Version 1.11.0 -->
    <script src="../js/jquery-1.11.0.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="../js/plugins/morris/raphael.min.js"></script>
    <script src="../js/plugins/morris/morris.min.js"></script>
    <script src="../js/plugins/morris/morris-data.js"></script>

</body>
</html>