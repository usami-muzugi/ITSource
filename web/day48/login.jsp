<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018-08-17
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="/day48/login" method="post">
    <input type="text" name="name"><br/>
    <input type="text" name="password"><br/>
    <input type="submit">
</form>
</body>
</html>
