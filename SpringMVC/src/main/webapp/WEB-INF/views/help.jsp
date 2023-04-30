<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<%-- <%

		String name = (String) request.getAttribute("name");
		Integer rollno = (Integer) request.getAttribute("rollno");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>	 --%>
	<h1>Name is <c:out value="${name}"/><%-- ${name }  --%></h1>
	<h1>Rollno is <c:out value="${rollno}"/><%--  ${rollno}  --%></h1>
	<h1>This is my help Page</h1>	
	<h1>Date and Time is <c:out value="${time}"/><%--  ${time}  --%></h1>
	<hr>
	
	<%-- <h1>${marks }</h1> --%>
	<c:forEach var="item" items="${marks}">
		<h1>Number : <c:out value="${item}" /></h1>
	</c:forEach>
</body>
</html>