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
    <title>购物车</title>
</head>
<body>
<hr>
<h3>购物车</h3>
<table border="1px" cellspacing="0" style="border-color: #66CCFF;">
    <tr>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>商品数量</th>
        <th>商品价格</th>
        <th>总价</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${ITEMS_IN_SESSION.items}" var="item">
        <tr>
            <td>${item["id"]}</td>
            <td>${item["name"]}</td>
            <td>${item["num"]}</td>
            <th>${item["price"]}</th>
            <td>${item["totalPrice"]}</td>
            <td><a href="cart?id=${item["id"]}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<hr/>
<a href="cart.jsp">返回</a>
</body>
</html>
