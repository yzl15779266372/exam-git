<%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<form action="success2.jsp" method="post">
    <input type="hidden" name="userid" value="${userid}">
    <input type="hidden" name="testid" value="${test.id}">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <td>答案</td>
            <td>待修改的题目</td>
            <td>该题的分数</td>
        </tr>
        <c:forEach begin="1" end="10" step="1" var="i">
            <tr>
                <td>${answer["ans".concat(i)]}</td>
                <td>${test["ans".concat(i)]}</td>
                <td><input type="text" name='score${i}'></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="提交">
</form>
</center>
</body>
</html>
