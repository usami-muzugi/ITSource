<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("ADMIN_IN_SESSION") == null) {
        request.getSession().setAttribute("msg", "未登录！");
        response.sendRedirect("login.jsp");
    }
    //这个Session....哎... 草！忘记大写了
    session.setAttribute("ADMIN_IN_SESSION", null);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    response.sendRedirect("index.jsp");
%>
