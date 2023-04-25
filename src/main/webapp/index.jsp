<%@page import="com.entity.Event"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EventDAO"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="com.conn.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eventfull</title>
<%@include file="CommonCSS.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
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
	<c:if test="${not empty SuccessMsg}">
							<p class="text-center text-success">${SuccessMsg}</p>
							<c:remove var="SuccessMsg" />
						</c:if>
						<c:if test="${not empty Error}">
							<p class="text-center text-success">${ErrorMsg}</p>
							<c:remove var="ErrorMsg" />
						</c:if>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Event Name</th>
					<th scope="col">Start Date</th>
					<th scope="col">End Date</th>
					<th scope="col">Location</th>
					<th scope="col">Category</th>
					<th scope="col">Description</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				EventDAO dao = new EventDAO(DBConnect.getConn());
				List<Event> list = dao.getAllEvents();
				for (Event e : list) {
				%>
				<tr>
					<th scope="row"><%=e.getEventName()%></th>
					<td><%=e.getEventStartDate()%></td>
					<td><%=e.getEventEndDate()%></td>
					<td><%=e.getEventLocation()%></td>
					<td><%=e.getEventCategory()%></td>
					<td><%=e.getEventDescription()%></td>
					<td><a href="UpdateEvent.jsp?id=<%=e.getEventID()%>"
						class="btn btn-sm btn-primary">Edit</a> 
						<a href="DeleteEvent.jsp"
						class="btn btn-sm btn-danger ms-1">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>