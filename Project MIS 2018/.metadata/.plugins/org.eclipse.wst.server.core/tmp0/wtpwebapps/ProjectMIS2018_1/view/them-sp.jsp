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
	<title>Thêm sản phẩm</title>

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

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Thêm sản phẩm mới
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="../index.html">Tổng quan</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Thêm sản phẩm
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                        <form role="form">

                            <div class="form-group">
                                <label>Tên sản phẩm</label>
                                <input class="form-control">
                           
                            </div>

                            <div class="form-group">
                                <label>Đơn giá</label>
                                <input class="form-control" placeholder="Vui lòng nhập chính xác">
                            </div>

                            <div class="form-group">
                                <label>Hình ảnh</label>
                                <input type="file">
                            </div>

                            <div class="form-group">
                                <label>Mô tả sản phẩm</label>
                                <textarea class="form-control" rows="3"></textarea>
                            </div>

                            <div class="form-group">
                                <label>Loại sản phẩm</label>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Ghế
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Bàn
                                    </label>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Tủ
                                    </label>
                                </div>
								<div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Giá treo
                                    </label>
                                </div>
								<div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Kệ xếp
                                    </label>
                                </div>
								<div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Cửa
                                    </label>
                                </div>
								<div class="checkbox">
                                    <label>
                                        <input type="checkbox" value="">Kính
                                    </label>
                                </div>
                            </div>

                            

                            

                            

                            <div class="form-group">
                                <label>Số lượng</label>
                                <select class="form-control">
                                    <option>10</option>
                                    <option>20</option>
                                    <option>30</option>
                                    <option>40</option>
                                    <option>50</option>
                                </select>
                            </div>
							<div class="form-group">
                                <label>Nhà sản xuất</label>
                                <input class="form-control">
                           
                            </div>

                           

                            <button type="submit" class="btn btn-default">Thêm sản phẩm</button>
                            <button type="reset" class="btn btn-default">Làm lại</button>

                        </form>

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