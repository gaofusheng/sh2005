<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/10 0010
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">添加教师信息</h1>
<form action=${pageContext.request.contextPath}/teacher/save method="post">

    <table border="2px" align="center">
        <input type="hidden" name="teaId" value="${teacher.teaId}">
        <tr>
            <td>教师姓名</td>
            <td><input type="text" name="teaName" value="${teacher.teaName}"></td>
        </tr>
        <tr>
            <td>教师年龄</td>
            <td><input type="text" name="teaAge"value="${teacher.teaAge}"></td>
        </tr>
        <tr>
            <td>教师性别</td>
            <td><input type="radio" name="teaSex" value="男" ${teacher.teaSex eq "男" ? "checked='checked'" : ""}>男
                <input type="radio" name="teaSex" value="女"${teacher.teaSex eq "女" ? "checked='checked'" : ""}>女
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

</body>
</html>
