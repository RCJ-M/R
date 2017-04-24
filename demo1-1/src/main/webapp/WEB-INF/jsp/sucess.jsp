<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/7
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>



<%--



本页面停止使用


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



用户修改登录密码，登录成功之后应该有一个现实修改密码的按钮，点击之后跳转到密码修改页面，
要求输入账号和密码，在输入新密码。电机确认，然后密码修改成功，然后跳转回来

<a href="/backView/changePaswd.jsp">修改密码:</a>


学生修改自己基本信息的功能：

<form action="/StuInfo" method="post">
    <input type="submit"value="修改基本信息">
</form>


</body>
</html>
