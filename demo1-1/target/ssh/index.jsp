<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<h1 align="center">学生教务管理系统</h1>

<form action="/login" method="post">

    <table>
        <tr>
            <td>
               账号:
                <input type="text" name="name" id="name"/>
            </td>
            <td>
               密码:
                <input type="password" name="password"  id="password"/>
            </td>
            <td>
                <input type="submit" value="登录"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
