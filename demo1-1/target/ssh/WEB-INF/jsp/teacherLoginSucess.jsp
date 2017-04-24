<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

请输入要添加成绩的课程ID,(从session 中获取教师的ID号,暂时使用手动添加的方式)

<p>当前用户</p>
<p>
    ${userId}
</p>
<form action="/find_all_stu" method="post">
    课程ID：<input type="text" name="courseId"/>
    <%--班级ID：<form:input path="classId"/>--%>
    <input type="submit" value="提交">
</form>


2.修改密码
<a href="/backView/changePaswd.jsp">修改密码:</a>
<br/>

3.查看课程表（待定选项）
这里应该有一个按钮，点击之后会显示出教师自己的课程表

<a href="/show_timetable/${userId}">查看课程表</a>
<br/>

4.退出登录
<a href="/index.jsp">login out</a>

</body>

</html>
