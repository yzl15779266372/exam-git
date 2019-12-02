package com.exam.domain;

/**
 * Created by shkstart on 2019/11/26
 */
public class Teach {
    private int id;
    private String name;
    private String username;

    public Teach(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    private String password;

    public Teach(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getUsername() {

        return username;
    }

    public Teach(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Teach() {

    }

    public Teach(String name, String password) {

        this.name = name;
        this.password = password;
    }
}
