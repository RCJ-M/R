<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/27
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>学生用户登录成功页面</title>
</head>
<body style=" margin:10px">

<h1 align="center">学生界面</h1>
<hr />
<p>当前用户</p>
<p>
    ${userId}
</p>

<%--
<input type="button" class="btn btn-primary" style="width: 160px" onclick="location.href('/backView/changePaswd.jsp')" value="修改密码">
--%>
<button class="btn btn-primary" style="width: 110px" onclick="location.href('/backView/changePaswd.jsp?userId=${userId}')">修改密码</button>
<br/>
<br/>
<form action="/view_stu_info" method="post">

    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit" class="btn btn-primary" value="查看基本信息"/>

</form>
<br />
<form action="/show_course_info" method="post">
    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit" class="btn btn-primary" name="submit" value="查看各科成绩">
</form>
<br />
<form action="/StuInfo" method="post">
    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit" class="btn btn-primary" value="修改基本信息">
</form>
<br />
<input type="button" class="btn btn-primary" style="width: 110px" onclick="location.href('/index.jsp')" value="退出登录">

</body>
</html>
