
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/27
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>教师登录成功页面</title>
</head>
<body>
<h1 align="center">教师界面</h1>
<hr>
<div>
<p>当前用户</p>
<p>
    ${userId}
</p>
</div>


<form action="/find_all_stu" method="post">
    <span class="btn btn-primary">添加学生成绩:</span><form:select path="courseList" name="courseId" class="btn btn-primary">
    <form:option value="NONE">请选择课程ID</form:option>
    <form:options items="${courseList}"/>
</form:select>
    <input type="hidden" name="teacherId" value="${userId}">
    <input type="submit" value="提交"class="btn btn-primary" >
</form>

<br />
<%--<div>
<input type="button" onclick="location.href('/backView/changePaswd.jsp')" value="修改密码" class="btn btn-primary" style="width: 160px">
</div>--%>
<button onclick="location.href('/backView/changePaswd.jsp?userId=${userId}')" class="btn btn-primary" style="width: 160px">修改密码</button>
<br />
<br />
<%--
<a href="/show_timetable/${userId}">查看课程表</a>
--%>
<%--<div>
<input type="button" onclick="location.href('/show_timetable/${userId}')" value="查看课程表" class="btn btn-primary" style="width: 160px">
</div>--%>
<button onclick="location.href('/show_timetable/${userId}')"  class="btn btn-primary" style="width: 160px">查看课程表</button>
<%--<div>
<input type="button" value="退出" onclick="location.href('/index.jsp')" class="btn btn-primary" style="width: 160px">
</div>--%>
<br />
<br />
<button  onclick="location.href('/index.jsp')" class="btn btn-primary" style="width: 160px">退出</button>
</body>

</html>
