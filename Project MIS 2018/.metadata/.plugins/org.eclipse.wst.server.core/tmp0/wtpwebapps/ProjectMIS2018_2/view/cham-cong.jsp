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
	<title>Chấm công</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/sb-admin.css" rel="stylesheet">

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

    <div id="wrapper">

        <!-- Navigation -->
        <jsp:include page="menu.jsp" />
        <!-- the end MENU -->

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Quản lý chấm công
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="../index.jsp">Tổng quan</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Chấm công
                            </li>
                        </ol>
                    </div>
                </div>
				<div><center>
				<h3>Hành động</h3>
				<a href="them-sp.jsp"><input type=button value = "Thêm"></a>
				<input type=button value = "Chỉnh sửa">
				<input type=button value = "Xóa">
				</center>
				</div>
				<br>
                <!-- /.row -->
				<div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
										<th><input type="checkbox" value=""></th>
										<th>STT</th>
										<th>Mã nhân sự</th>
                                        <th>Mã chấm công</th>
                                        <th>Ngày chấm</th>
                                        <th>Chi tiết chấm công</th>
										<!-- <th>Nhà sản xuất</th> -->
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
									<tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
									<tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
                                    <tr>
										<td><input type="checkbox" value=""></td>
                                        <td>0001</td>
                                        <td>NSK001</td>
                                        <td>MCC001</td>
                                        <td>10/5/2018</td>
										<td>class Nhan su, TTLV001, tốt</td>
										<!-- <td>Co.ltd Group 12 MIS </td> -->
                                    </tr>
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