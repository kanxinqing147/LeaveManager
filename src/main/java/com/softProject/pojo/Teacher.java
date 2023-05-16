package com.softProject.pojo;

public class Teacher extends User {
    String teacherName;
    String gender;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                '}';
    }
}
