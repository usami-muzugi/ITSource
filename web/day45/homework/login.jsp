<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息系统</title>
</head>
<h1>学生信息系统 - 登录页</h1>
账号:usamimizugi<br/>
密码:ourinsama
<hr/>

<form action="/day45/homework5/login" method="post">
    账号:<input type="text" name="admin"><br/>
    密码:<input type="password" name="password">
    <input type="reset" value="重置"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
