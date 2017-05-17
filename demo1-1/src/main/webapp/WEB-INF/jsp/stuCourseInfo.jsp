
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/22
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生课程成绩页面</title>
</head>
<body>

<table class="table">
    <tr >
        <td>课程ID</td>
        <td>课程名称</td>
        <td>课程绩点</td>
        <td>考试成绩</td>
    </tr>
<c:forEach var="course" items="${list}" varStatus="status" >
        <tr >
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.courseGradePoint}</td>
            <td>${course.courseScore}</td>
        </tr>
</c:forEach>
</table>

</body>
</html>
