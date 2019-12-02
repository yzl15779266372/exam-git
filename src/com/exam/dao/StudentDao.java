package com.exam.dao;

import com.exam.domain.Student;

/**
 * Created by shkstart on 2019/11/26
 */
public class StudentDao extends DAO<Student> {

    public int getID(String username,String password){
        String sql = "SELECT id FROM student where username=? AND password=?";
        return getForValue(sql,username,password);
    }

    public Student getForId(int id){
        String sql = "SELECT id,name,username,password FROM student WHERE id=?";
        return get(sql,id);
    }

    public void saveScore(int userid,int score,int testid){
        String sql = "INSERT INTO teststudent (userid,testid,score) VALUES(?,?,?)";
        update(sql,userid,testid,score);
    }

}
