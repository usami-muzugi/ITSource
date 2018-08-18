<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/8/13
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录页</title>
    <script type="text/javascript">
        function touchme(me) {
            me.src = "/day47/homework/auth?authCode=" + Math.random();
        }
    </script>
</head>
<body>
<h1>用户信息系统 - 登录页</h1>
账号:wen<br/>
密码:wen
<hr/>
${msg}
<form action="login" method="post">
    账号:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    验证码:<input type="text" name="code"> <img src="/day47/homework/auth" alt="验证码" onclick="touchme(this)">
    <input type="reset" value="重置"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
