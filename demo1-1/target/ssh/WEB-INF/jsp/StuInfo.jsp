<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/24
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>学生基本信息修改页面</title>
</head>
<body>

<form:form method="post" action="/ChangeStuInfo">
    <table bgcolor="aqua">

        <tr>

            <td>
              <form:input path="id" type="hidden" value="${id}"/>
            </td>
        </tr>
        <tr>
            <td>
                姓名
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>

        <tr>
            <td>
                性别
            </td>
            <td>
                <form:input path="sex"/>
            </td>
        </tr>
        <tr>
            <td>
                出生日期
            </td>
            <td>
                <form:input path="birthday"/>
            </td>
        </tr>
        <tr>
            <td>
                民族
            </td>
            <td>
                <form:input path="nation"/>
            </td>
        </tr>
        <tr>
            <td>
                家庭住址
            </td>
            <td>
                <form:input path="address"/>
            </td>
        </tr>
        <tr>
            <td>
                宗教信仰
            </td>
            <td>
                <form:input path="religon"/>
            </td>
        </tr>
        <tr>
            <td>
                联系方式
            </td>
            <td>
                <form:input path="phone"/>
            </td>
        </tr>
        <tr>
            <td>
                邮箱
            </td>
            <td>
                <form:input path="email"/>
            </td>
        </tr>
        <tr>
            <td>

                <input type="submit" value="提交">
            </td>
        </tr>
    </table>


</form:form>
</body>
</html>
