<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Đơn hàng</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome-4.1.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<%@include file="//Menu.jsp" %>
		
		<div id="page-wrapper">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Thống kê đơn hàng</h1>
						<ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Tổng
									quan</a></li>
							<li class="active"><i class="fa fa-table"></i> Đơn hàng</li>
						</ol>
					</div>
				</div>
				<div>
					<center>
						<h3>Hành động</h3>
						<a href="them-sp.html"><input type=button value="Thêm"></a>
						<input type=button value="Chỉnh sửa"> <input type=button
							value="Xóa">
					</center>
				</div>
				<br>
				<!-- Table Don hang -->
				<div class="table-responsive">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" value=""></th>
								<th>STT</th>
								<th>ID sản phẩm</th>
								<th>Tên sản phẩm</th>
								<th>Đơn giá</th>
								<th>Số lượng</th>
								<th>Mô tả</th>
								<!-- <th>Nhà sản xuất</th> -->
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Co.ltd Group 12 MIS </td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>TN0001</td>
								<td>Bàn tròn xoay inox</td>
								<td>629.000 VNĐ</td>
								<td>10</td>
								<td>Sản phẩm mới được gia công thủ công....</td>
								<!-- <td>Bàn</td> -->
							</tr>
							<tr>
								<td><input type="checkbox" value=""></td>
								<td>SP0001</td>
								<td>PA Grace1</td>
								<td>Ghế Grace 1</td>
								<td>190.000 VNĐ</td>
								<td>19</td>
								<td>Sản phẩm nội thất căn hộ mới gia công....</td>
								<!-- <td>Ghế</td> -->
							</tr>
						</tbody>
					</table>
				</div>
				<!-- /.row -->

				<br>
				<!-- /.row -->

				<div class="row">
					<div class="col-lg-6">
						<h2>Thống kê theo ngày</h2>
						<div class="table-responsive">
							<table class="table table-bordered table-hover">
								<thead>
									<tr>
										<th>Loại mặt hàng</th>
										<th>Lượng truy cập</th>
										<th>% Lượng truy cập mới</th>
										<th>Doanh thu</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Ghế</td>
										<td>1265</td>
										<td>32.3%</td>
										<td>650.000 VNĐ</td>
									</tr>
									<tr>
										<td>Bàn</td>
										<td>261</td>
										<td>33.3%</td>
										<td>150.000 VNĐ</td>
									</tr>
									<tr>
										<td>Tủ</td>
										<td>665</td>
										<td>21.3%</td>
										<td>320.000 VNĐ</td>
									</tr>
									<tr>
										<td>Giá treo</td>
										<td>9516</td>
										<td>89.3%</td>
										<td>1.500.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kệ xếp</td>
										<td>230</td>
										<td>34.3%</td>
										<td>250.000 VNĐ</td>
									</tr>
									<tr>
										<td>Cửa</td>
										<td>421</td>
										<td>60.3%</td>
										<td>350.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kính</td>
										<td>1233</td>
										<td>93.2%</td>
										<td>950.000 VNĐ</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="col-lg-6">
						<h2>Thống kê theo tháng</h2>
						<div class="table-responsive">
							<table class="table table-bordered table-hover">
								<thead>
									<tr>
										<th>Loại mặt hàng</th>
										<th>Lượng truy cập</th>
										<th>% Lượng truy cập mới</th>
										<th>Doanh thu</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Ghế</td>
										<td>1265</td>
										<td>32.3%</td>
										<td>650.000 VNĐ</td>
									</tr>
									<tr>
										<td>Bàn</td>
										<td>261</td>
										<td>33.3%</td>
										<td>150.000 VNĐ</td>
									</tr>
									<tr>
										<td>Tủ</td>
										<td>665</td>
										<td>21.3%</td>
										<td>320.000 VNĐ</td>
									</tr>
									<tr>
										<td>Giá treo</td>
										<td>9516</td>
										<td>89.3%</td>
										<td>1.500.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kệ xếp</td>
										<td>230</td>
										<td>34.3%</td>
										<td>250.000 VNĐ</td>
									</tr>
									<tr>
										<td>Cửa</td>
										<td>421</td>
										<td>60.3%</td>
										<td>350.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kính</td>
										<td>1233</td>
										<td>93.2%</td>
										<td>950.000 VNĐ</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!-- /.row -->


				<!-- /.row -->

				<div class="row">
					<div class="col-lg-6">
						<h2>Thống kê theo năm</h2>
						<div class="table-responsive">
							<table class="table table-bordered table-hover table-striped">
								<thead>
									<tr>
										<th>Loại mặt hàng</th>
										<th>Lượng truy cập</th>
										<th>% Lượng truy cập mới</th>
										<th>Doanh thu</th>
									</tr>
								</thead>
								<tbody>
									<tr class="active">
										<td>Ghế</td>
										<td>1265</td>
										<td>32.3%</td>
										<td>650.000 VNĐ</td>
									</tr>
									<tr class="success">
										<td>Bàn</td>
										<td>261</td>
										<td>33.3%</td>
										<td>150.000 VNĐ</td>
									</tr>
									<tr class="warning">
										<td>Tủ</td>
										<td>665</td>
										<td>21.3%</td>
										<td>320.000 VNĐ</td>
									</tr>
									<tr class="danger">
										<td>Giá treo</td>
										<td>9516</td>
										<td>89.3%</td>
										<td>1.500.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kệ xếp</td>
										<td>230</td>
										<td>34.3%</td>
										<td>250.000 VNĐ</td>
									</tr>
									<tr>
										<td>Cửa</td>
										<td>421</td>
										<td>60.3%</td>
										<td>350.000 VNĐ</td>
									</tr>
									<tr>
										<td>Kính</td>
										<td>1233</td>
										<td>93.2%</td>
										<td>950.000 VNĐ</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>

				</div>
				<!-- /.row -->

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery Version 1.11.0 -->
	<script src="js/jquery-1.11.0.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>
</html>