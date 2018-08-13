<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/12
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达式</title>
</head>
<body>
<%
    request.setAttribute("msg", "request");
    session.setAttribute("msg", "session");
    pageContext.setAttribute("msg", "session");
    application.setAttribute("msg", "application");
%>

<%--<%=--%>
<%--pageContext.findAttribute("msg");--%>
<%--%>--%>

${msg}
</body>
</html>
