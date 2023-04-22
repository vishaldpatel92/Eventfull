<%@ page import="java.sql.Connection"  %>
<%@ page import="com.conn.DBConnect"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eventfull</title>
<%@include file="CommonCSS.jsp"%>
</head>
<body>
	<%@include file="Navbar.jsp"%>
<%-- 
 	Connection conn = DBConnect.getConn();
 	out.print(conn);
--%>
	<h1 class="text-center">Welcome to Eventfull</h1>
	<h2 class="text-center">Popular events</h2>
	<div class="container p-5">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Event Name</th>
					<th scope="col">Start Time</th>
					<th scope="col">Start Time</th>
					<th scope="col">Location</th>
					<th scope="col">Description</th>
					<th scope="col">Banner</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>