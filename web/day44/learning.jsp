<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/11
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learning JSP</title>
</head>
<body>
学习JSP
<%
    System.out.println("在这里可以写纯的JAVA代码");
    String string = "这里还可以定义变量和方法";
%>

<%=string%>

<%!
    /*加上这个标签可以在JSP里面定义方法，定义全局变量*/
    void print(String string) {
        System.out.println(string);
    }

    /*定义一个全局变量*/
    private static Integer id;
%>

<%
    print("你好JSP，第N次见面辣");
%>


</body>
</html>
