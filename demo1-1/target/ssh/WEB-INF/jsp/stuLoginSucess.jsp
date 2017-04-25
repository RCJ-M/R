<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/27
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>学生用户登录成功页面</title>
</head>
<body>


<p>当前用户</p>
<p>
    ${userId}
</p>

1.修改登录密码</br>
<a href="/backView/changePaswd.jsp">修改密码:</a></br>

2查看自己基本信息</br>
<form action="/view_stu_info" method="post">
<p>
    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit" value="submit"/>
</p>
</form>

3.查看各科成绩</br>
<form action="show_course_info" method="post">
    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit" name="submit" value="查看各科成绩">
</form>
4.修改自己基本信息</br>
<form action="/StuInfo" method="post">

    <input type="hidden"name="id" value="${userId}"/>
    <input type="submit"value="修改基本信息">

</form>

5.退出登录
<a href="/index.jsp">login out</a>
</body>
</html>
