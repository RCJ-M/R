
<%--
  Created by IntelliJ IDEA.
  User: yudian-it
  Date: 2017/3/22
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生课程成绩页面</title>
</head>
<body>

<table border="1" bgcolor="aqua">
    <tr border="1" bgcolor="#6495ed">
        <td>课程ID</td>
        <td>课程名称</td>
        <td>课程绩点</td>
        <td>考试成绩</td>
    </tr>
<c:forEach var="course" items="${list}" varStatus="status" >
        <tr border="1" bgcolor="#6495ed">
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.courseGradePoint}</td>
            <td>${course.courseScore}</td>
        </tr>
</c:forEach>
</table>

</body>
</html>
