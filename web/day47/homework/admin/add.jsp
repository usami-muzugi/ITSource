<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("ADMIN_IN_SESSION") == null) {
        request.getSession().setAttribute("msg", "未登录！");
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<h1>用户信息系统 - 添加页面</h1>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>添加用户</h3>
<form action="add" method="post">
    用户名:<input type="text" name="username"><br/>
    密码:<input type="text" name="password"><br/>
    性别:<select name="sex">
    <option value="true">男</option>
    <option value="false">女</option>
</select><br/>
    地址:<input type="text" name="address"><br/>
    钱钱:<input type="number" name="balance">
    <br/>
    <input type="submit" value="确定">
</form>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
