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
    <title>管理员登录成功页面</title>
</head>
<body style="margin: 10px;">
<h1 align="center">管理员界面</h1>
<hr>

<p>当前用户</p>
<p>
    ${userId}
</p>


<form action="/init_password" method="post" onsubmit="return check();">
    <span>初始化用户:</span><input type="text" name="userId" value="请输入账号..." id="userid"/>
    <input type="submit" value="提交" class="btn btn-primary" />
    <input type="hidden" name="adminId" value="${userId}"/>
</form>
<br/>
<form action="/addUser" method="post" onsubmit="return checkUser();">
    <span>添加新用户:</span><input type="text" value="请输入新加账号..." name="userId" id="user"/>

    <input type="submit" value="提交" class="btn btn-primary"/>
</form>


<input type="button" class="btn btn-primary" style="width: 110px" onclick="location.href('/index.jsp')" value="退出登录">

<script>

    function  check() {
        var id=document.getElementById("userid").value;
        if(id.length!=12&&4!=id.length){
            alert("帐号长度有误！");
            return false;
        }
        else {
            alert("初始化成功");
            return true;
        }
    }
    function checkUser() {
        var ID=document.getElementById("user").value;
        if(ID.length!=12&&4!=ID.length){
            alert("帐号长度有误！");
            return false;
        }
                else if(null==ID||ID.equals("")){
            alert("帐号长度有误！");
            return false;
        }
       else return true;
    }
</script>
</body>
</html>
