<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生个人信息</title>
</head>
<body>
<h1>学生信息系统 - 管理页面</h1>
<small><a href="add.jsp">添加</a></small>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>学生详细信息表</h3>
<table border="1px" cellspacing="0" style="border-color: #66CCFF;">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <tr>
        <td>${studentList["id"]}</td>
        <td>${studentList["name"]}</td>
        <th>${stu_info["age"]}</th>
        <th><c:choose>
            <c:when test="${stu_info.sex}=1">基佬</c:when>
            <c:otherwise>女</c:otherwise>
        </c:choose></th>
    </tr>
</table>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
