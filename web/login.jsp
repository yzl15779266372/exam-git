<%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 14:51
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

    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <table>
            <tr>
                <td>UserName: </td>
                <td><input type="text" name="username"></td>
            </tr>

            <tr>
                <td>Password: </td>
                <td><input type="password" name="password"></td>
            </tr>

            <tr>
                <td>权限：</td>
                <td>学生：<input type="radio" value="student" name="person"><br>
                    教师：<input type="radio" value="teach" name="person">
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登陆"></td>
            </tr>
            <tr>
                <td colspan="2"><font color="red">${message}</font></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
