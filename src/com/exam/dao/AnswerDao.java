package com.exam.dao;

import com.exam.db.JdbcUtils;
import com.exam.domain.Answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by shkstart on 2019/11/26
 */
public class AnswerDao extends DAO<Answer>{

    public Answer get(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Answer answer = null;
        String sql = "SELECT * FROM answer WHERE id=?";
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
                answer = new Answer(nid,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return answer;
    }
}
