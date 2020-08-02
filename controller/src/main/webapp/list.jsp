<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/30
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link HREF="css/css.css" rel="stylesheet">
</head>
<body>
    <form action="list" method="post">
        <input type="hidden" name = "cpage">
        姓名：<input type="text" name="mohu1" value="${map.mohu1}"><br>
        出生日期：<input type="date" name="day1" value="${map.day1}">--<input type="date" name="day2" value="${map.day2}">
        <input type="submit" value="查询">
    </form>
    <button onclick="add()">添加</button>
    <table>
        <tr>
            <td>应聘人</td>
            <td>性别</td>
            <td>年龄</td>
            <td>毕业学校</td>
            <td>所学专业</td>
            <td>学历</td>
            <td>学位</td>
            <td>面试成绩</td>
            <td>平均分</td>
            <td>操作</td>

        </tr>
        <c:forEach items="${list}"  var="l">
            <tr>
                <td>${l.aname}</td>
                <td>${l.gender}</td>
                <td>${l.birthday}</td>
                <td>${l.college}</td>
                <td>${l.major}</td>
                <td>${l.edu == 1? "专科" : l.edu == 2 ? "本科":"研究生"}</td>

                <td>${l.degree == 1? "学士" : l.degree == 2 ? "硕士":"博士"}</td>
                <td>${l.mscj}</td>
                <td>${l.avgcj}</td>
                <td>
                    <input type="button" onclick="xiu(${l.aid})"value="更新" />
                    <input type="button" onclick="del(${l.aid})"value="删除" />

                    <input type="button" onclick="login('${l.aid}','${l.aname}')" value="录入成绩">

                </td>

            </tr>
        </c:forEach>
        <tr>
            <td colspan="11">
                <button onclick="fenye(1)">首页</button>
                <button onclick="fenye(${p.isIsFirstPage() ? 1 : p.getPrePage()})">上一页</button>
                <c:forEach items="${p.navigatepageNums}" var="n">
                    <button onclick="fenye(${n})">${n}</button>
                </c:forEach>
                <button onclick="fenye(${p.isIsLastPage() ? p.getPages() : p.getNextPage()})">下一页</button>
                <button onclick="fenye(${p.getPages()})">尾页</button>
            </td>
        </tr>
    </table>

</body>
    <script type="text/javascript">
        function fenye(cpage) {
            alert(cpage)
            $("[name = 'cpage']").val(cpage);
            $("form").submit();
        }
        function add() {
            location="toAdd";
        }
        function xiu(aid) {
            location="toXiu?aid="+aid;
        }
        function del(aid) {
            location="delete?aid="+aid;
        }
        function login(aid,aname) {
            location="toLuru?aid="+aid+"&aname="+aname;
        }

    </script>
</html>
