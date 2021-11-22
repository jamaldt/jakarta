<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Jakarta web appa</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<h2>welcome again</h2>
<br/>
<form action="login" method="post">
    Name:<input type="text" name="name">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit" value="login">
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>