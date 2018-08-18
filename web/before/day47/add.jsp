<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h1>学生信息系统 - 添加页面</h1>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>添加学生</h3>
<form action="/day47/new_captcha" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    性别:<select name="sex">
    <option value="男">男</option>
    <option value="女">女</option>
</select><br/>
    班级:<input type="text" name="cls">
    <br/>
    <input type="submit" value="确定">
</form>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
