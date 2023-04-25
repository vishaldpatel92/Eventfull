<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Event</title>
<%@include file="CommonCSS.jsp"%>

</head>
<body class="bg-light">
	<%@include file="Navbar.jsp"%>
	<h3 class="col-md-5 offset-md-4">Insert event details below</h3>

	<div class="container">
		<div class="row">
			<div class="col-md-5 offset-md-3">
				<div class="card">
					<div class="card-body">
						<c:if test="${not empty SuccessMsg}">
							<p class="text-center text-success">${SuccessMsg}</p>
							<c:remove var="SuccessMsg" />
						</c:if>
						<c:if test="${not empty Error}">
							<p class="text-center text-success">${ErrorMsg}</p>
							<c:remove var="ErrorMsg" />
						</c:if>

						<form action="AddEvent" method="post">
							<div class="d-grid gap-3" style="width: 500px;">
								<div class="col-md-auto">
									<label class="form-label">Event Name</label> <input
										class="form-control" name="E_Name" type="text"
										placeholder="Enter event name">
								</div>
								<div class="col-md-auto">
									<label class="form-label">Select start time</label> <input
										id="startDate" class="form-control" name="E_Start" type="date" />
									<span id="startDateSelected"></span>
								</div>
								<div class="col-md-auto">
									<label class="form-label">Select end time</label> <input
										id="endDate" class="form-control" name="E_End" type="date" />
									<span id="endDateSelected"></span>
								</div>
								<div class="col-md-auto">
									<select class="form-select" name="E_Location">
										<option selected>Select location</option>
										<option value="Ahmedabad">Ahmedabad</option>
										<option value="Gandhinagar">Gandhinagar</option>
										<option value="Anand">Anand</option>
									</select>
								</div>
								<div class="col-md-auto">
									<select class="form-select" name="E_Category">
										<option selected>Select Category</option>
										<option value="Music">Music</option>
										<option value="Business">Business</option>
										<option value="Sports">Sports</option>
										<option value="Concert">Concert</option>
										<option value="Exhibition">Exhibition</option>
									</select>
								</div>
								<div class="col-md-auto">
									<label class="form-label">Description</label> <input
										class="form-control" name="E_Description" type="text"
										placeholder="Description">
								</div>

								<button type="submit" class="btn btn-primary col-md-auto">Create
									Event</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>