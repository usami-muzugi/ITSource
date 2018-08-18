<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018-08-15
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
<form action="cart?cmd=add" method="post">
    商品名: <select name="name">
    <option value="手机">手机</option>
    <option value="平板">平板</option>
    <option value="电脑">电脑</option>
    <option value="手表">手表</option>
    <option value="小姐姐">小姐姐</option>
</select><br/>
    数量: <input type="number" name="num" value="1">
    <br/><input type="submit" value="买买买">
</form>
</body>
</html>
