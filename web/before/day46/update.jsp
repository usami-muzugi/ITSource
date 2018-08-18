<%@ page import="cn.ximcloud.itsource.before.day46_rebuild._01rebuild.dao.impl.StudentImpl" %>
<%@ page import="cn.ximcloud.itsource.before.day46_rebuild._01rebuild.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/14
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    StudentImpl student = (StudentImpl) application.getAttribute("student");

    String id = request.getParameter("id");
    Student stu = student.find(Integer.valueOf(id));
    request.setAttribute("stu", stu);
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
<form action="/day46/update" method="post">
    I&nbsp;&nbsp;&nbsp;D:<input type="text" name="id" value="${stu["id"]}"><br/>
    姓名:<input type="text" name="name" value="${stu["name"]}"><br/>
    年龄:<input type="text" name="age" value="${stu["age"]}"><br/>
    性别:<select name="sex">
    <option value="男">男</option>
    <option value="女">女</option>
</select><br/>
    班级:<input type="text" name="cls" value="${stu["cls"]}"><br/>
    <input type="submit" value="确定">
</form>
<hr/>
<a href="list.jsp">返回</a>
</body>
</html>
