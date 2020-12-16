<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/10 0010
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    function del(id) {
        if (confirm("确定删除吗?")){
            window.location.href="${pageContext.request.contextPath}/teacher/delete?teaId="+id
        }
    }
    function deletes() {
        if ($("[name=\"teaIds\"]:checked").length>0){
                if (confirm("确认删除吗?")){
                    $("#fid").submit();
                }
        }else{
            alert("请选中复选框")
        }
    }
    $(function () {
        $("#ck").click(function () {
            $("[name=\"teaIds\"]").prop("checked",this.checked)
        })
    })
</script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
<html>
<head>
    <title>所有教师信息</title>
</head>
<body>
<h1 align="center">搜索</h1>
 <form action=${pageContext.request.contextPath}/teacher/teacherlist>
     <table align="center">
         <tr>
             <td>教师姓名</td>
             <td><input type="text" name="teaName"value="${param.teaName}"></td>
         </tr>
         <tr>
             <td>教师年龄</td>
             <td><input type="text" name="teaAge" value="${param.teaAge}">至<input type="text" name="teaAgeEnd" value="${param.teaAgeEnd}"></td>
         </tr>
         <tr>
             <td>入职日期</td>
             <td><input type="text" name="teadate" value="${param.teadate}"class="Wdate" onClick="WdatePicker()" readonly="readonly">至<input type="text" name="teadateEnd"value="${param.teadateEnd}"class="Wdate" onClick="WdatePicker()"readonly="readonly"></td>
         </tr>
         <tr>
             <td>教师性别</td>
             <td><input type="radio" name="teaSex" value="男" ${param.teaSex eq "男" ? "checked='checked'":""}>男
                 <input type="radio" name="teaSex" value="女"${param.teaSex eq "女" ? "checked='checked'":""}>女
                 <input type="radio" name="teaSex" value="" ${param.teaSex eq "" ? "checked='checked'":""}>不限
             </td>
         </tr>
         <tr>
             <td><input type="submit" value="搜索"></td>
         </tr>
     </table>
 </form>
<center><a href=${pageContext.request.contextPath}/teacher/add>添加教师信息</a></center>
<form action="${pageContext.request.contextPath}/teacher/deletes" id="fid">
 <h1 align="center">教师管理</h1>
  <table align="center" border="1px">
      <td align="center" colspan="7"><a href="javascript:deletes()">批量删除</a></td>
      </tr>
    <tr>
        <td><input type="checkbox" id="ck">全选/取消</td>
        <td>教师编号</td>
        <td>教师姓名</td>
        <td>教师年龄</td>
        <td>教师性别</td>
        <td>信息删除</td>
        <td>信息修改</td>
    </tr>
    <c:forEach var="teacher" items="${pageInfo.list}">
        <tr>
            <td><input type="checkbox" name="teaIds" vale="${teacher.teaId}"></td>
            <td>${teacher.teaId}</td>
            <td>${teacher.teaName}</td>
            <td>${teacher.teaAge}</td>
            <td>${teacher.teaSex}</td>
            <td><a href="javascript:del(${teacher.teaId})">删除</a></td>
            <td><a href=${pageContext.request.contextPath}/teacher/add?teaId=${teacher.teaId}>修改</a></td>
        </tr>
    </c:forEach>
</table>
</form>
       当前第${pageInfo.pageNum}页，总共${pageInfo.pages}页，总共记录${pageInfo.total}
        <a href="${pageContext.request.contextPath}/teacher/teacherlist?no=1">首页</a>
         <a href="${pageContext.request.contextPath}/teacher/teacherlist?no=2">第二页</a>
</body>
</html>
