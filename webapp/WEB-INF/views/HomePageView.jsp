<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">		  
		<%@include file="fragments/IncludeInHeadFragment.jspf" %>
		  
		<title>Home Page</title>
	</head>
	
	<body>
		<%@include file="fragments/HeaderFragment.jspf" %>
		
		<div class="container">
		  	<h1>${message}</h1>
		  	<h2>${pageContext.request.contextPath}</h2>
		  	<h2>${pageContext.request.requestURI}</h2>
		</div>
		
		<%@include file="fragments/FooterFragment.jspf" %>
	</body>
	
</html>