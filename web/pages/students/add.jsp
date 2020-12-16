<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8 0008
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">添加学生信息</h1>
<form action=${pageContext.request.contextPath}/students/save>
    <table border="2px" align="center">
        <tr>
            <td>学生姓名</td>
            <td><input type="text" name="stuName"></td>
        </tr>
        <tr>
            <td>学生性别</td>
            <td><input type="radio" name="stuSex" value="0">男
                <input type="radio" name="stuSex" value="1">女
            </td>
        </tr>
        <tr>
            <td>学生状态</td>
            <td><input type="radio" name="stuStatus" value="0">离校
                <input type="radio" name="stuStatus" value="1">在校
            </td>
        </tr>
        <tr>
            <td>
            <select name="teaId">
                 <option value="">请选择老师</option>
                <c:forEach items="${teacherList}" var="teacher">
                    <option value="${teacher.teaId}">${teacher.teaName}</option>
                </c:forEach>
            </select>
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
