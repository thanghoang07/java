<%@page import="java.util.List"%>
<%@page import="NhanSu.NhanSu" %>
<%@page import="NhanSu.DAONhanSu" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="col-md-8">
		<table id="tour" class="table table-striped table-bordered"
			cellspacing="0" width="100%">
			<thead class="bg-primary">
				<tr>
					<th style="width: 90px;">Stt</th>
					<th style="width: 100px;">Tên</th>
					<th style="width: 100px;">Mail</th>
					<th>Điện thoại</th>

				</tr>

			</thead>
			<tbody>
				<%
					List<NhanSu> place = DAONhanSu.getListNhanSu();
					for (int i = 0; i < place.size(); i++) {
				%>
				<tr>
					<td><%=i + 1%></td>
					<td><%=place.get(i).getTenNS()%></td>
					<td><%=place.get(i).getMaNS()%></td>
					<td><%=place.get(i).getDiaChi()%></td>
				</tr>

				<%
					}
				%>


			</tbody>
		</table>
	</div>
</body>
</html>