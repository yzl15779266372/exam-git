<%@ page import="com.exam.dao.StudentDao" %><%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 21:35
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
    <%
        int sum = 0;
        for(int i=1;i<=10;++i){
            String str = "score"+i;
            sum+=Integer.parseInt(request.getParameter(str));
        }
        request.setAttribute("sum",sum);
    %>
    <h4>总成绩为${sum}</h4>
    <%
        int userid = Integer.parseInt(request.getParameter("userid"));
        int testid = Integer.parseInt(request.getParameter("testid"));
        StudentDao studentDao = new StudentDao();
        studentDao.saveScore(userid,testid,sum);
    %>
    <a href="teach.jsp">返回</a>
</center>
</body>
</html>
