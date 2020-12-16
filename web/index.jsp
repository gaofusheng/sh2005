<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/7 0007
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询所有学生信息</title>
  </head>
  <body>
       <a href=${pageContext.request.contextPath}/students/list>学生管理</a>
       <a href=${pageContext.request.contextPath}/students/add>添加学生信息</a>
       <a href=${pageContext.request.contextPath}/emp/emplist>员工管理</a>
       <a href=${pageContext.request.contextPath}/emp/empadd>添加员工信息</a>
       <a href=${pageContext.request.contextPath}/teacher/teacherlist>教师管理</a>
       <a href=${pageContext.request.contextPath}/users/login>用户登录</a>
       <form action="${pageContext.request.contextPath}/user/dosome">
           <table>
               <tr>
                   <td>姓名</td>
                   <td><input type="text" name="name"></td>
               </tr>
               <tr>
                   <td>年龄</td>
                   <td><input type="text" name="age"></td>
               </tr>
               <tr>
                   <td><input type="submit" value="提交"></td>
               </tr>
           </table>
       </form>
  </body>
</html>
