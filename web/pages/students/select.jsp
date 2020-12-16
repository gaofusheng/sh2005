<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8 0008
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/students/update">
    <table border="2px" align="center">
        <input type="hidden" name="stuId" value="${students.stuId}">
        <tr>
            <td>学生姓名</td>
            <td><input type="text" name="stuName" value="${students.stuName}"></td>
        </tr>
        <tr>
            <td>学生性别</td>
            <td>
                <input type="radio" name="stuSex" value="0" ${students.stuSex eq 0 ? "checked='checked'":""}>男
                <input type="radio" name="stuSex" value="1" ${students.stuSex eq 1 ? "checked='checked'":""}>女
            </td>
        </tr>
        <tr>
            <td>学生状态</td>
            <td><input type="radio" name="stuStatus" value="0" ${students.stuStatus eq 0 ? "checked='checked'" : ""}>离校
                <input type="radio" name="stuStatus" value="1" ${students.stuStatus eq 1 ? "checked='checked'" : ""}>在校
            </td>
        </tr>
        <tr>
            <td>
            <select name="teaId">
                <option value="">学生教师</option>
                <c:forEach items="${list}" var="teacher">
                    <option value="${teacher.teaId}" ${students.teaId eq teacher.teaId ? "selected='selected'" :""}>${teacher.teaName}</option>
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
