<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/12
  Time: 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String var;
    if (session.getAttribute("var") == null) {
        var = "0.00";
    } else {
        var = session.getAttribute("var").toString();
        System.out.println("var1:" + var);
    }

%>
<html>
<head>
    <title>计算器</title>
</head>
<body>
<form action="/day44/homework2/SumServlet" method="post">
    <input type="text" name="val_a" value="<%=var%>">
    <select name="select">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">%</option>
    </select>
    <input type="text" name="val_b"> = <%=var%> <input type="submit">
</form>
<%=session.getAttribute("1231")%>
</body>
</html>
