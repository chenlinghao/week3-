<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/30
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
<form>
    <input type="hidden" name="aid" value="${param.aid}">
    应聘人:${param.aname}<br>
    面试职位:<select name="jid">

</select><br>
    面试分数:<input type="text"name = "score"><br>
    应聘人:${param.aname}<br>
    <input type="button" value="保存" onclick="baocun()">

</form>

</body>
    <script type="text/javascript">
        $.post(
            "listJob",
            function (data) {
                for(var i in data){
                    $("[name = 'jid']").append("<option value="+data[i].jid+">"+data[i].jname+"</option>")
                }
            }

        );
        function baocun() {
            $.post(
                "addScore",
                $("form").serialize(),
                function (a) {
                    if(a>0){
                        alert("添加成功")
                        location = "list";
                    }else{
                        alert("添加失败")
                    }
                },"json"
            );
        }
    </script>
</html>
