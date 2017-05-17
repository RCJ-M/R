<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/23
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>学生密码修改页面</title>
</head>
<body style="margin: 10px;">
<form name="changePaswd" action="/change_Paswd_Stu" method="post">
    请输入账号：<input name="id" type="text"/>
    请输入旧密码：<input name="passwordOld" type="password"/>
    请输入新密码：<input name="passwordNew" type="password"/>
    <input type="hidden" name="userId" value="${param.userId}">
    <input type="submit" value="提交" class="btn btn-primary" />
</form>
</body>
</html>
