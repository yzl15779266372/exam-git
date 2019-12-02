package com.exam.dao;

import com.exam.db.JdbcUtils;
import com.exam.domain.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shkstart on 2019/11/26
 */
public class TestDao extends DAO<Test> {

    public void save(Test test){
        String sql = "INSERT INTO submit (ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10," +
                "userID,testID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        update(sql,test.getAns1(),test.getAns2(),test.getAns3(),test.getAns4(),test.getAns5(),test.getAns6()
        ,test.getAns7(),test.getAns8(),test.getAns9(),test.getAns10(),test.getUserID(),test.getTestID());
    }

    public List<Test> getAll(){
        List<Test> all = new ArrayList<>();
        String sql = "select count(id) from submit";
        int count = Integer.parseInt(getForValue(sql).toString());
        for (int i = 1; i <=count; i++) {
            all.add(get(i));
        }
        return all;
    }

    public Test get(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Test test = null;
        String sql = "SELECT * FROM submit WHERE id=?";
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int nid = resultSet.getInt("id");
                String ans1 =resultSet.getString("ans1");
                String ans2 =resultSet.getString("ans2");
                String ans3 =resultSet.getString("ans3");
                String ans4 =resultSet.getString("ans4");
                String ans5 =resultSet.getString("ans5");
                String ans6 =resultSet.getString("ans6");
                String ans7 =resultSet.getString("ans7");
                String ans8 =resultSet.getString("ans8");
                String ans9 =resultSet.getString("ans9");
                String ans10 =resultSet.getString("ans10");
                int userid = resultSet.getInt("userID");
                int testid = resultSet.getInt("testID");
                test = new Test(nid,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,userid,testid);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return test;
    }
}
