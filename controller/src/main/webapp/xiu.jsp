<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/30
  Time: 14:30
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
    应聘人:<input type="text" name="aname"><br>
    性别:<input type="radio" name="gender" value="男">男
    <input type="radio" name="gender" value="女">女
    <br>
    出生日期:<input type="text" name="birthday"><br>
    毕业大学：<input type="text" name="college"><br>
    所学专业:<input type="text" name="major"><br>
    学历:<select name="edu">
    <option value="1">专科</option>
    <option value="2">本科</option>
    <option value="3">研究生</option>
</select>
    学位:<select name="degree">
    <option value="1">学士</option>
    <option value="2">硕士</option>
    <option value="3">博士</option>
</select><br>

    <input type="button" value="保存" onclick="baocun()">

</form>

</body>
<script type="text/javascript">
    $.post(
      "listOne",
        {"aid":${param.aid}},
        function (obj) {
            $("[name = 'aname']").val(obj[0].aname);
            $("[name = 'gender'][value = "+obj[0].gender+"]").prop("checked",true);
            $("[name = 'birthday']").val(obj[0].birthday);
            $("[name = 'college']").val(obj[0].college);
            $("[name = 'major']").val(obj[0].major);
            $("[name = 'edu']").val(obj[0].edu);
            $("[name = 'degree']").val(obj[0].degree);

        },"json"
    );

    function baocun() {
        $.post(
            "xiuApplicant",
            $("form").serialize(),
            function (a) {
                if(a>0){
                    alert("修改成功")
                    location = "list";
                }else{
                    alert("修改失败")
                }
            },"json"
        );
    }
</script>
</html>
