<%@ page import="cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl.UserImpl" %>
<%@ page import="cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: wizard
  Date: 2018/8/14
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    UserImpl user = (UserImpl) application.getAttribute("user");

    String id = request.getParameter("id");
    User tempUser = user.find(Long.valueOf(id));
    request.setAttribute("tempUser", tempUser);
%>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>学生信息系统 - 修改页面</h1>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>修改学生</h3>
<form action="update" method="post">
    <input type="hidden" name="id" value="${tempUser["id"]}">
    用户名:<input type="text" name="username" value="${tempUser["username"]}"><br/>
    密码:<input type="text" name="password" value="${tempUser["password"]}"><br/>
    性别:<select name="sex">
    <c:if test="${tempUser.sex==true}">
        <option value="true" selected="selected">男</option>
        <option value="false">女</option>
    </c:if>
    <c:if test="${tempUser.sex==false}">
        <option value="true">男</option>
        <option value="false" selected="selected">女</option>
    </c:if>
</select><br/>
    地址:<input type="text" name="address" value="${tempUser["address"]}"><br/>
    钱钱:<input type="number" name="balance" value="${tempUser["balance"]}">
    <br/>
    <input type="submit" value="确定">
</form>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>