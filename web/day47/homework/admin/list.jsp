<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 14:14
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
    <title>所有用户信息</title>
</head>
<br>
<h1>用户信息系统 - 管理页面</h1>
欢迎回来，${ADMIN_IN_SESSION["username"]}<br />
<small><a href="add.jsp">添加</a></small>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>用户信息表</h3>
<table border="1px" cellspacing="0" style="border-color: #66CCFF;">
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>地址</th>
        <th>钱钱</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach items="${USERLIST_IN_SESSION}" var="user">
        <tr>
            <td>${user["id"]}</td>
            <td>${user["username"]}</td>
            <td>${user["password"]}</td>
            <c:if test="${user.sex==true}">
                <td>男</td>
            </c:if>
            <c:if test="${user.sex==false}">
                <td>女</td>
            </c:if>
            <th>${user["address"]}</th>
            <td>${user["balance"]}</td>
            <th><a href="update.jsp?id=${user["id"]}">修改</a></th>
            <th><a href="remove?id=${user["id"]}">删除</a></th>
        </tr>
    </c:forEach>
</table>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
