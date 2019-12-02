<%@ page import="com.exam.domain.Test" %>
<%@ page import="java.util.List" %>
<%@ page import="com.exam.dao.TestDao" %><%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    TestDao testDao = new TestDao();
    List<Test> allTest = testDao.getAll();
    request.setAttribute("all",allTest);
%>
<center>
    <h3>亲爱的${user.name}老师，以下是未改试卷：</h3><br><br>
    <table border="1" cellspacing="0" cellpadding="10">
        <tr>
            <th>测试ID</th>
            <th>试卷类型</th>
            <th>学生ID</th>
            <th>修改试卷</th>
        </tr>
        <c:forEach items="${all}" var="test">
            <tr>
                <th>${test.id}</th>
                <th>
                    <c:choose>
                        <c:when test="${test.testID ==1}">A</c:when>
                        <c:when test="${test.testID ==2}">B</c:when>
                        <c:when test="${test.testID ==3}">C</c:when>
                    </c:choose>
                </th>
                <th>${test.userID}</th>
                <th><a href="/updateServlet?id=${test.id}">去修改</a></th>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
