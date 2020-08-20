<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<h2>Authorization</h2>
<c:url value="/login" var="var"/>
<form action="${var}" method="POST">
    <label for="login">Login</label>
    <input type="text" name="title" id="login">
    <label for="password">Password</label>
    <input type="text" name="year" id="password">
    <input type="submit" value="SignIn">
</form>
</body>
</html>