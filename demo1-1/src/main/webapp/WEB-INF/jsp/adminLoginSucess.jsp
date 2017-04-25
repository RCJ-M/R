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
    <title>管理员登录成功页面</title>
</head>
<body>
管理员登录成功，在附上相关权限界面

<p>当前用户</p>
<p>
    ${userId}
</p>

1.初始化指定账户的密码(这里初始化成功后没有提示，要改善下)
<form action="/init_password" method="post">
    初始化账号:<input type="text" name="userId">
    <input type="submit" value="提交"/>
    <input type="hidden" name="adminId" value="${userId}">
</form>
2.添加学生/教师用户

<form action="/addUser" method="post">
请输入要添加的账号：<input type="text" name="userId"/>

    <input type="submit" value="提交">
</form>

4.退出登录
<a href="/index.jsp">login out</a>
</body>
</html>
