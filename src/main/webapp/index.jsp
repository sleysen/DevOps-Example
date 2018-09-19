<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Addition Application</title>
</head>
<body>

<div class="jumbotron text-center" style="background-color:#000000">
  <h1 style="color:#86BC25" >Welcome to the addition Application</h1>
  <p style="color:#86BC25">Current Time is : <%=new java.util.Date()%></p>
</div>

	
	<form id=fr_add name=fr_add method=get action="AddNumbers">
		A : <input type=text value="" class="form-control" name=a><br> 
		B : <input type=text value="" class="form-control" name=b><br> 
			<input type=submit class="btn btn-success" name=sb value="A+B">
	</form>
</body>
</html>


