<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8 0008
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">

</script>
<html>
<head>
    <title>查询的所有学生信息</title>
</head>
<body>
<h1 align="center">学生管理</h1>
 <table align="center" border="1px">
       <tr>
           <td>学生编号</td>
           <td>学生姓名</td>
           <td>学生性别</td>
           <td>学生状态</td>
           <td>学生老师</td>
           <td>删除信息</td>
           <td>修改信息</td>
       </tr>
     <c:forEach var="students" items="${studentsList}">
     <tr>
         <td>${students.stuId}</td>
         <td>${students.stuName}</td>
         <td>${students.stuSex eq 0 ? "男": "女"}</td>
         <td>${students.stuStatus eq 0 ? "离校" : "在校"}</td>
         <td>${students.teacher.teaName}</td>
         <td><a href=${pageContext.request.contextPath}/students/delete?stuId=${students.stuId}>删除</a></td>
         <td><a href=${pageContext.request.contextPath}/students/select?stuId=${students.stuId}>修改</a></td>
     </tr>
     </c:forEach>
 </table>
</body>
</html>
