<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/8 0008
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">添加员工信息</h1>
      <form action="/ssm/emp/addemp">
          <table border="1px" align="center">
              <tr>
                  <td>员工姓名</td>
                  <td><input type="text" name="ename"></td>
              </tr>
              <tr>
                  <td>员工职位</td>
                  <td><input type="text" name="job"></td>
              </tr>
              <tr>
                  <td>员工领导</td>
                  <td><input type="text" name="mgr"></td>
              </tr>
              <tr>
                  <td>入职日期</td>
                  <td><input type="text" name="hiredate"></td>
              </tr>
              <tr>
                  <td>员工薪资</td>
                  <td><input type="text" name="sal"></td>
              </tr>
              <tr>
                  <td>COMM</td>
                  <td><input type="text" name="comm"></td>
              </tr>
              <tr>
                  <td>员工部门</td>
                  <td><input type="text" name="deptno"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="提交"></td>
                  <td><input type="reset" value="重置"></td>
              </tr>
          </table>
      </form>

</body>
</html>
