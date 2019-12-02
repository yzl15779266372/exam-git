package com.exam.dao;

import com.exam.domain.Teach;

/**
 * Created by shkstart on 2019/11/26
 */
public class TeachDao extends DAO<Teach>{

    public int getID(String username,String password){
        String sql = "SELECT id FROM teach where username=? AND password=?";
        return getForValue(sql,username,password);
    }

    public Teach getForId(int id){
        String sql = "SELECT id,name,username,password FROM teach WHERE id=?";
        return get(sql,id);
    }

}
