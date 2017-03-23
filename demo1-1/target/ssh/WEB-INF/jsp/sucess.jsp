<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/7
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录成功
用户:(这里要写用户id，返回时有用)

查看学生基本信息请输入学生的学号：。。。。然后在返回学生的信息
<form action="/view_stu_info" method="post">
    学生学号:<input type="text" name="id">
    <input type="submit" name="submit" value="提交">
</form>

查看学生自己的课程成绩（课程的id，名称，绩点，成绩）
<form action="show_course_info" method="post">
    学生学号:<input type="text" name="id">
    <input type="submit" name="submit" value="查看各科成绩">
</form>


</body>
</html>
