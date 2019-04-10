<%@page import="dao.ThongKeSoLuongDonHang"%>
<%@page import="jdk.nashorn.internal.ir.Labels"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Thong ke bieu do</title>

<script src="https://www.chartjs.org/dist/2.7.2/Chart.bundle.js"></script>
<style type="text/css">/* Chart.js */
@
-webkit-keyframes chartjs-render-animation {
	from {opacity: 0.99
}

to {
	opacity: 1
}

}
@
keyframes chartjs-render-animation {
	from {opacity: 0.99
}

to {
	opacity: 1
}

}
.chartjs-render-monitor {
	-webkit-animation: chartjs-render-animation 0.001s;
	animation: chartjs-render-animation 0.001s;
}
</style>
<style>
canvas {
	-moz-user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}
</style>
</head>
<body>

	<%
		ThongKeSoLuongDonHang tk = new ThongKeSoLuongDonHang();

		List<String> listMaDonHang = new ArrayList<String>();

		listMaDonHang = tk.layMAKH();

		List<Integer> listSoLuongDonHang = new ArrayList<Integer>();

		for (String makh : listMaDonHang) {
			int soluong = tk.thongKeDonHangTheoDanhSachMKH(makh);
			listSoLuongDonHang.add(soluong);
		}
	%>

	<div style="width: 75%;">
		<div class="chartjs-size-monitor"
			style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
			<div class="chartjs-size-monitor-expand"
				style="position: absolute; left: 0; top: 0; right: 0; bottom: 0; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
				<div
					style="position: absolute; width: 1000000px; height: 1000000px; left: 0; top: 0"></div>
			</div>
			<div class="chartjs-size-monitor-shrink"
				style="position: absolute; left: 0; top: 0; right: 0; bottom: 0; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
				<div
					style="position: absolute; width: 200%; height: 200%; left: 0; top: 0"></div>
			</div>
		</div>
		<canvas id="myChart" width="596" height="298"
			class="chartjs-render-monitor"
			style="display: block; width: 596px; height: 298px;"></canvas>
	</div>


	<script type="text/javascript">
		var soLuongDonHang =
	<%=listSoLuongDonHang%>
		;

		var makh =
	<%=listMaDonHang%>
		;

		var ctx = document.getElementById('myChart').getContext('2d');
		var chart = new Chart(ctx, {
			// The type of chart we want to create
			type : 'bar',

			// The data for our dataset
			data : {
				labels : makh,
				datasets : [ {
					label : "Số lượng đơn hàng",
					backgroundColor : 'rgb(255, 0, 10)',
					borderColor : 'rgb(255, 0, 10)',
					data : soLuongDonHang,
				} ]
			},

			options : {
				responsive : true,
				title : {
					display : true,
					text : 'Chart.js Line Chart'
				},
				tooltips : {
					mode : 'index',
					intersect : false,
				},
				hover : {
					mode : 'nearest',
					intersect : true
				},
				scales : {
					xAxes : [ {
						display : true,
						scaleLabel : {
							display : true,
							labelString : 'Month'
						}
					} ],
					yAxes : [ {
						display : true,
						scaleLabel : {
							display : true,
							labelString : 'Value'
						},
						ticks : {
							min : 0,
							max : 100,

							// forces step size to be 5 units
							stepSize : 5
						}
					} ]
				}
			}
		});
	</script>

</body>
</html>