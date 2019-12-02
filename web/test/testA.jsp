<%--
  Created by IntelliJ IDEA.
  User: yzl
  Date: 2019/11/26
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/testServlet?method=testA" method="post">
    <input type="hidden" name="method" value="testA">
    <input type="hidden" name="testCase" value="${requestScope.testCase}">
    <h1>试题A</h1><br><br>
    一、选择题<br><br>

    1.下列合法的标识符为<input type="text" name="ans1" size="4">。<br><br>

    A. abcd+&nbsp;&nbsp;&nbsp;&nbsp;B.#KDJF&nbsp;&nbsp;&nbsp;&nbsp;C. 67KDJ&nbsp;&nbsp;&nbsp;&nbsp;D.DK3_<br><br>

    2.字符串"vm\x43\\\np\102q"的长度是<input type="text" name="ans2" size="4">。<br><br>

    A. 8 B. 10 C.17 D. 16<br><br>

    3.对for（表达式1; ;表达式3）可理解为<input type="text" name="ans3" size="4">。<br><br>

    A.for（表达式1; ;表达式3）<br>
    B.for（表达式1; 1 ;表达式3）<br>
    C.for（表达式1;表达式1 ;表达式3）<br>
    D.for（表达式1;表达式3 ;表达式3）<br><br>

    4.若有代数式3ae/bc,则不正确的C语言表达式是<input type="text" name="ans4" size="4">。<br><br>
    A.?a/b/c*e*3? B.?3*a*e/b/c?<br>
    C.?3*a*e/b*c? D.?a*e/c/b*3?<br>

    二、填空题<br><br>

    5.已知int?a[3][2]={3,?2,?1};则表达式“?a[0][0]/a[0][1]”的值是<input type="text" name="ans5" size="6">。<br><br>

    6.下面程序段的运行结果为<input type="text" name="ans6"  size="6">。<br><br>
    x=2;
    do{printf("*");?x--;?}?while(!x==0);?<br>

    7.设a、b、c均为int型变量且a=6,b=4,c=2,则表达式！(a-b)+c-1 && b+c/2的值是<input type="text" name="ans7" size="6">。<br><br>

    8.若有条件“2&lg;x&lg;3或x&lg;-10”，其对应的C语言表达式是___x&gt;2 && x&gt;3 || x&lg;-10<input  size="6" type="text" name="ans8">。<br><br>

    三、编程题<br>
    9.随机输入十个数，编程实现排序。（用选择排序）<br>
    <textarea name="ans9" value="Please Input Your Answer!" rows="10" cols="30"></textarea><br><br>

    10.打印杨辉三角。<br>
    <textarea name="ans10" value="Please Input Your Answer!" rows="10" cols="30"></textarea><br><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
