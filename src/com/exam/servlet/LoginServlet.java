package com.exam.servlet;

import com.exam.dao.StudentDao;
import com.exam.dao.TeachDao;
import com.exam.domain.Student;
import com.exam.domain.Teach;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shkstart on 2019/11/26
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private StudentDao studentDao = new StudentDao();
    private TeachDao teachDao = new TeachDao();
    private Student student;
    private Teach teach;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String person = request.getParameter("person");
        boolean flag = false;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("student".equals(person)) {
            flag = getPersonIsStudent(username, password);
            request.getSession().setAttribute("user", student);
            request.getRequestDispatcher("student.jsp").forward(request, response);
            return;
        } else if ("teach".equals(person)) {
            flag = getPersonIsTeach(username, password);
            request.getSession().setAttribute("user", teach);
            request.getRequestDispatcher("teach.jsp").forward(request, response);
            return;
        }
        if (flag == false) {
            request.setAttribute("message", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    private boolean getPersonIsStudent(String username, String password) {
        int id = studentDao.getID(username, password);
        if (id > 0) {
            student = studentDao.getForId(id);
            return true;
        } else {
            return false;
        }
    }

    private boolean getPersonIsTeach(String username, String password) {
        int id = teachDao.getID(username, password);
        if (id > 0) {
            teach = teachDao.getForId(id);
            return true;
        } else {
            return false;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
