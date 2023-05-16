package com.softProject.pojo;

public class User {
    Integer username;
    String password;

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "useerId=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
