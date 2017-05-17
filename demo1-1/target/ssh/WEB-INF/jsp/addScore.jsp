<!DOCTYPE html>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/28
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>添加学生成绩界面</title>
</head>
<body>
<form action="/add_stu_score" method="post">
    <table class="table">
        <tr>
            <td>
                课程ID
            </td>
            <td>
                学生ID
            </td>
            <td>
                学生考试成绩
            </td>
        </tr>
        <c:forEach var="stuId" items="${stulist}" varStatus="status">
            <tr>
                <td>
                ${courseId}
                </td>
                <td>
                        ${stuId}
                </td>
                <td>
                    <input type="hidden" name="stuId" value="${stuId}"/>

                    <input type="text" name="score"/>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <input type="hidden" name="courseId" value="${courseId}"/>
                <input type="hidden" name="teacherId" VALUE="${teacherId}">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
