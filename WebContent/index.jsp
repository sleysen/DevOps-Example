<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Addition Application</title>
</head>
<body>

	<% out.print("<h1>My Addition Application</h1>"); %>
	<hr>
	Welcome to the addition Application
	<br> Current Time is :
	<%=new java.util.Date()%>
	<hr>
	
	<form id=fr_add name=fr_add method=get action="AddNumbers">
		A : <input type=text value="" name=a><br> 
		B : <input type=text value="" name=b><br> 
			<input type=submit name=sb value="A+B">
			<input type=submit name=sb value="A*B">
	</form>
</body>
</html>