<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/7 0007
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>城市列表</title>
</head>
<body>
<c:forEach var="city" items="${cityList}">

    ${city.cid}, ${city.cname} <br/>

</c:forEach>


</body>
</html>
