<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<form action="save">
id : <input type="text" name="id"><br>
name : <input type="text" name="name"><br>
<input type="submit"><br>
</form>

----------------------------------------
Update Details
<body>
<form action="/update">
<input type="text" name="id"><br>
<input type="text" name="name"><br>
<input type="submit"><br>
</form>

----------------------------------------
Delete Customer
<body>
<form action="/delete">
<input type="text" name="id"><br>
<input type="text" name="name"><br>
<input type="submit"><br>
</form>

----------------------------------------
Get Customer Details
<body>
<form action="/get">
<input type="text" name="id"><br>
<input type="submit"><br>
</form>

----------------------------------------

Find All
<body>
<form action="/findAll">
<input type="submit"><br>
</form>

----------------------------------------

Delete All
<body>
<form action="/deleteAll">
<input type="submit"><br>
</form>
</body>
</html>