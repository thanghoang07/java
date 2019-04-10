<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">TK Shop Admin</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu message-dropdown">
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>Hoàng Vũ</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM
									</p>
									<p>Hôm qua bạn có một tin nhắn từ...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>Hoàng Vũ</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM
									</p>
									<p>Hôm qua bạn có một tin nhắn từ...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="E:\Admin-SB-v2\SB-Admin-2-master\img\sms.png" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>Hoàng Vũ</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Hôm qua lúc 4:32 PM
									</p>
									<p>Hôm qua bạn có một tin nhắn từ từ...</p>
								</div>
							</div>
					</a></li>
					<li class="message-footer"><a href="#">Xem tất cả tin nhắn</a>
					</li>
				</ul></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-bell"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu alert-dropdown">
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-default">Alert Badge</span></a></li>
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-primary">Alert Badge</span></a></li>
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-success">Alert Badge</span></a></li>
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-info">Alert Badge</span></a></li>
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-warning">Alert Badge</span></a></li>
					<li><a href="#">Bạn có đơn hàng từ <span
							class="label label-danger">Alert Badge</span></a></li>
					<li class="divider"></li>
					<li><a href="#">Xem tất cả</a></li>
				</ul></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-user"></i> Hoàng Vũ <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#"><i class="fa fa-fw fa-user"></i> Trang cá
							nhân</a></li>
					<li><a href="#"><i class="fa fa-fw fa-envelope"></i> Hộp
							thư</a></li>
					<li><a href="#"><i class="fa fa-fw fa-gear"></i> Cài đặt</a></li>
					<li class="divider"></li>
					<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Đăng
							xuất</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<li><a href="index.jsp"><i class="fa fa-fw fa-dashboard"></i>
						Tổng quan</a></li>
				<li><a href="charts.html"><i
						class="fa fa-fw fa-bar-chart-o"></i> Thống kê chi tiết</a></li>
				<li><a href="tables.html"><i
						class="fa fa-fw fa-table"></i> Đơn hàng</a></li>
				<li><a href="KhachHang.jsp"><i class="fa fa-fw fa-table"></i>
						Khách hàng</a></li>

				<li><a href="javascript:;" data-toggle="collapse"
					data-target="#demo"><i class="fa fa-fw fa-table"></i> Sản Phẩm
						<i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="quan-ly-sp.html">Tổng quan</a></li>
						<li><a href="them-sp.html">Thêm sản phẩm mới</a></li>
					</ul></li>
				<li><a href="bootstrap-grid.html"><i
						class="fa fa-fw fa-wrench"></i> Cài đặt</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse --> </nav>

	</div>
</body>
</html>