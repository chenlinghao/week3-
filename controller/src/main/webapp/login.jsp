<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/31
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
    <form action="<%=request.getContextPath()%>/login" method="post">
       用户名： <input type="text" name = "username"><br>
        密码：<input type="text" name = "password"><br>
        <input type="submit" value="登录">
    </form>
    <input type="button" onclick="zc()" value="注册">
    <input type="button" onclick="zhaohui()" value="找回密码">
</body>
    <script type="text/javascript">
        function zc() {
            location = "zc.jsp";
        }
        function zhaohui() {
            location = "zhaohui.jsp";
        }
    </script>
</html>
