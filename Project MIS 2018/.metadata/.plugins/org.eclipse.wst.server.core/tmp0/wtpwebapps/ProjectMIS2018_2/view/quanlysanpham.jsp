<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="dao.ISanPham"%>
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
<title>Quản lý sản phẩm bàn</title>

<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../font-awesome-4.1.0/css/font-awesome.min.css"
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
		<jsp:include page="menu.jsp" />
		<!-- the end MENU -->

		<div id="page-wrapper">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Quản lý sản phẩm</h1>
						<ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="../index.jsp">Tổng
									quan</a></li>
							<li class="active"><i class="fa fa-edit"></i> Sản phẩm</li>
							<li class="active"><i class="#"></i> Bàn</li>
						</ol>
					</div>
				</div>
				<div>
					<center>
						<h3>Hành động</h3>
						<a href="them-sp.jsp"><input type=button value="Thêm"></a>
						<input type=button value="Chỉnh sửa"> <input type=button
							value="Xóa">
					</center>
				</div>
				<br>
				<!-- /.row -->
				<div class="table-responsive">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>ID sản phẩm</th>
								<th>Tên sản phẩm</th>
								<th>Số lượng</th>
								<th>Đơn giá</th>
								<th>Kích thước</th>
								<th>Mã Loại Hàng</th>
							</tr>
						</thead>
						<tbody>
							<%
								ISanPham spimpl = new SanPhamDAO();

								ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();

								String ma_loaihang = request.getParameter("ma_loaihang");

								listSanPham = spimpl.layDanhSachSanPhamTheoMaLoaiHang(ma_loaihang);

								for (SanPham sp : listSanPham) {
							%>

							<tr>
								<td><%=sp.getMa_sp()%></td>
								<td><%=sp.getTen_sp()%></td>
								<td><%=sp.getSoluong()%></td>
								<td><%=sp.getGia()%></td>
								<td><%=sp.getKichthuoc()%></td>
								<td><%=sp.getMa_loaihang()%></td>
							</tr>

							<%
								}
							%>

						</tbody>
					</table>
				</div>
				<!-- /.row -->

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

</body>
</html>