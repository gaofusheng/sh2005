<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/16 0016
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/ssm/js/jquery-3.2.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
省:
<select id="province">
    <%--  <c:forEach items="${cities}" var="city">
          <option>${city.pid}</option>
      </c:forEach>--%>
</select>
<script type="text/javascript">
    $.ajax({
        url:"/ssm/objectTest02",
        dataType:"json",
        type:"get",
        success:function (data) {
            $.each(data,function (i,n) {
                $("#province").append("<option>"+n.cname+"</option>")
            })
        }
    })

</script>

</body>
</html>
