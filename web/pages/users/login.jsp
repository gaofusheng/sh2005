<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/13 0013
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center">${ex.message}登录</h1>
      <form action="${pageContext.request.contextPath}/users/select" method="post">
          <table border="1px" align="center">
              <tr>
                  <td>用户姓名</td>
                  <td><input type="text" name="userName"></td>
              </tr>
              <tr>
                  <td>用户密码</td>
                  <td><input type="text" name="password"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="登录"></td>
              </tr>
          </table>
      </form>
</body>
</html>
