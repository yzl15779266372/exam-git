package com.exam.servlet;

import com.exam.dao.AnswerDao;
import com.exam.dao.StudentDao;
import com.exam.dao.TeachDao;
import com.exam.dao.TestDao;
import com.exam.domain.Answer;
import com.exam.domain.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shkstart on 2019/11/26
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {

    private TestDao testDao = new TestDao();
    private TeachDao teachDao = new TeachDao();
    private StudentDao studentDao = new StudentDao();
    private AnswerDao answerDao = new AnswerDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int testid = Integer.parseInt(request.getParameter("id"));
        Test test = testDao.get(testid);
        Answer answer = answerDao.get(test.getTestID());
        request.setAttribute("test",test);
        request.setAttribute("userid",test.getUserID());
        request.setAttribute("answer",answer);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
