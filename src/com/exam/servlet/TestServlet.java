package com.exam.servlet;

import com.exam.dao.TestDao;
import com.exam.domain.Student;
import com.exam.domain.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by shkstart on 2019/11/26
 */
@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {

    private TestDao testDao = new TestDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String methodName = request.getParameter("method");
        System.out.println(methodName);
        try {
            Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void submit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "test/test";
        Integer testCase = Integer.parseInt(request.getParameter("test"));
        request.setAttribute("testCase", testCase);
        if (1 == testCase) {
            path += "A" + ".jsp";
        } else if (2 == testCase) {
            path += "B" + ".jsp";
        } else if (3 == testCase) {
            path += "C" + ".jsp";
        }
        request.getRequestDispatcher(path).forward(request, response);
    }

    private void testA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = (Student) request.getSession().getAttribute("user");
        int studentID = student.getId();
        int testID = Integer.parseInt(request.getParameter("testCase"));
        String ans1 = request.getParameter("ans1");
        String ans2 = request.getParameter("ans2");
        String ans3 = request.getParameter("ans3");
        String ans4 = request.getParameter("ans4");
        String ans5 = request.getParameter("ans5");
        String ans6 = request.getParameter("ans6");
        String ans7 = request.getParameter("ans7");
        String ans8 = request.getParameter("ans8");
        String ans9 = request.getParameter("ans9");
        String ans10 = request.getParameter("ans10");
        Test test = new Test(ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, studentID, testID);
        testDao.save(test);
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
