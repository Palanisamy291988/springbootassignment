<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>spring-boot-assignment</title>
<style>
body{
	background-color : Tan;
	width : 70%;
}
label{
font-color: black;
}

</style>

</head>
<body>

	<p align="center"><h1>Spring Boot Hibernate Application - Home Page<h1/></p>
	
	<form action="home" method="post">
		<input type="submit" id="home" value="Home" style="width: 250px">
	</form> 
	
	
</body>
</html>