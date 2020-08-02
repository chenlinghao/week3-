<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/8/1
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
<form action="#">
    用户名： <input type="text" name = "username"><br>
    密码：<input type="password" name = "password"><br>
    确认密码:<input type="password" name="password1"><br>
    <input type="button" onclick="zc()" value="注册" >
</form>
    <script type="text/javascript">
        function zc(){
           var username =  $("[name='username']").val();
           alert(username);
            $.post(
                "chaUser",
                {"username": username},
                function (a) {
                    if (a>0) {
                        alert("本用户已存在,请取它名");
                        $("[name='username']").val("");
                        $("[name='password']").val("");
                        $("[name='password1']").val("");
                    } else {
                        var pw = $("[name='password']").val();
                        var pw1 = $("[name='password1']").val();
                        if (pw == pw1) {
                            $.post(
                                "zc",
                                $("form").serialize(),
                                function (obj) {
                                    if (obj>0){
                                        alert("注册成功,请登录");
                                        location = "login";
                                    }
                                },"json"
                            )

                        }

                    }

                },"json"
            );
        }
    </script>
</body>
</html>
