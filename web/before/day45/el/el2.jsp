<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/12
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
<%--获取学生的所有信息--%>
${student}<br/>
<%--获取这个学生的某些信息--%>
${student["name"]}<br/>
${student["fav"]}<br/>
${student["fav"][0]}<br/>
${student["fav"][1]}<br/>
${student["fav"][2]}<br/>
<%--就算是数组越界也不会报错，很是友好--%>
${student["fav"][3]}<br/>
${student["fav"][4]}<br/>
<%--list本质上也是一个数组--%>
${student["list"]}<br/>
${student["list"][0]}<br/>
${student["list"][1]}<br/>
${student["list"][2]}<br/>
<%--但是map不是数组，所以不能用上面的方式来操作--%>
${student["map"]}<br/>
<%--这里可以这样操作--%>
${student["map"].耀文}<br/>
<%--还能这样操作--%>
${student.map.耀文}<br/>


${student["map"]["耀文"]}<br/>
${student["map"]["www.itsource.cn"]}<br/>


</body>
</html>
