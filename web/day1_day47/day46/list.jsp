<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有学生信息</title>
</head>
<body>
<h1>学生信息系统 - 管理页面</h1>
<small><a href="add.jsp">添加</a></small>
<small><a href="logout.jsp">登出</a></small>
<hr>
<h3>学生表</h3>
<table border="1px" cellspacing="0" style="border-color: #66CCFF;">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>班级</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach items="${ALL_STUDENT_IN_SESSION}" var="studentList">
        <tr>
            <td>${studentList["id"]}</td>
            <td>${studentList["name"]}</td>
            <td>${studentList["age"]}</td>
            <th>${studentList["sex"]}</th>
            <td>${studentList["cls"]}</td>
            <th><a href="/day1_day47/day46/update.jsp?id=${studentList[">修改</a></th>
            <th><a href="/day46/remove?id=${studentList["id"]}">删除</a></th>
        </tr>
    </c:forEach>
</table>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
