<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clicker</title>
</head>
<body>


	<div style="text-align:center;">
		<form method="post" action="/ButtonClicker/trackSession"><input type="submit" value="Click Me!"></form>
		<h1>You have clicked this button <%= (Integer) request.getSession().getAttribute("count") %> times</h1>
	</div>
	

</body>
</html>
