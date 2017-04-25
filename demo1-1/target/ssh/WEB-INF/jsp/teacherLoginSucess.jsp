<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/27
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>教师登录成功页面</title>
</head>
<body>

<p>当前用户</p>
<p>
    ${userId}
</p>

添加学生成绩，应当有一个下拉列表，里面有老师所对应的课程，选择一个课程之后弹出该门课程所对应的所有学生
<form action="/find_all_stu" method="post">
    课程ID:<form:select path="courseList" name="courseId">
    <form:option value="NONE">请选择</form:option>
    <form:options items="${courseList}"/>
</form:select>
    <input type="hidden" name="teacherId" value="${userId}">
    <%--班级ID：<form:input path="classId"/>--%>
    <input type="submit" value="提交">
</form>


2.修改密码
<a href="/backView/changePaswd.jsp">修改密码:</a>
<br/>

3.查看课程表
这里应该有一个按钮，点击之后会显示出教师自己的课程表
<a href="/show_timetable/${userId}">查看课程表</a>
<br/>

4.退出登录
<a href="/index.jsp">login out</a>

</body>

</html>
