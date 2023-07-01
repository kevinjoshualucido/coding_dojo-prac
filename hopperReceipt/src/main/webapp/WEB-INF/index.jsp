<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Receipt</title>
</head>
<body>
	<h1>Custoner Name: <c:out value="${ name }"/></h1>
	<h2>Item Name: <c:out value="${ item }"/></h2>
	<h2>Price: $<c:out value="${ price }"/></h2>
	<h2>Description: <c:out value="${ desc }"/></h2>
	<h2>Vendor: <c:out value="${ vendor }"/></h2>
</body>
</html>