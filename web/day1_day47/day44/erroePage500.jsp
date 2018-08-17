<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/11
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
我是500错误页,错误页面也可以打印错误信息
JSP是9大内置对象，但是只有声明式错误页面的时候(isErrorPage="true")，才会出现exception错误对象。
这里打印下这个错误<%=exception%>
</body>
</html>
