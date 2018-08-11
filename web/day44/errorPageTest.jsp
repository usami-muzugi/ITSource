<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/11
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="erroePage500.jsp" %>
<html>
<head>
    <title>错误页测试</title>
</head>
<body>
    错误页测试
    在可能发生错误，或者是需要捕获错误的页面，可以手动添加上一个 errorPage错误页
    然后在错误页声明这个页面是一个错误页，isErrorPage
    手写一个错误
    如果要给所有的页面添加一个错误页的话，
    可以在项目的Web.xml文件当中，添加如下的内容
    <code>
        <error-page>
            <error-code>404</error-code>
            <location>/day44/errorPage404.jsp</location>
        </error-page>
    </code>
    但是更改了web.xml需要重新启动tomcat服务器
<%
    System.out.println(1/0);
%>
</body>
</html>
