<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/23
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生密码修改页面</title>
</head>
<body>
<form name="changePaswd" action="/change_Paswd_Stu" method="post">
    请输入账号：<input name="id" type="text"/>
    请输入旧密码：<input name="passwordOld" type="password"/>
    请输入新密码：<input name="passwordNew" type="password"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
