<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8 0008
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">员工管理</h1>
<table align="center" border="1px">
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工职位</td>
        <td>员工领导</td>
        <td>入职日期</td>
        <td>员工工资</td>
        <td>员工补贴</td>
        <td>员工部门</td>
        <td>操作</td>
        <td>修改</td>
    </tr>
    <c:forEach var="emp" items="${empList}">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td><a href=${pageContext.request.contextPath}/emp/delete?empno=${emp.empno}>删除</a></td>
            <td><a href=${pageContext.request.contextPath}/emp/select?empno=${emp.empno}>修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
