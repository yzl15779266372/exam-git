<%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 15:56
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
    <h3>亲爱的${user.name}同学，请选择你的试卷：</h3><br><br>
    <form action="/testServlet" method="post">
        <input type="hidden" name="method" value="submit">
        试卷A:<input type="radio" value="1" name="test"><br>
        试卷B:<input type="radio" value="2" name="test"><br>
        试卷C:<input type="radio" value="3" name="test"><br>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
