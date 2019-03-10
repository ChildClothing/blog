package com.slc.blog.entity;


public class User {

    private int id;
    private String name;
    private String loginName;
    private String password;
    private String moblie;
    private String email;

    public User() {
    }

    public User(int id, String name, String loginName, String password, String moblie, String email) {
        this.id = id;
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.moblie = moblie;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", moblie='" + moblie + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
