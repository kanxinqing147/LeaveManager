package com.softProject.pojo;

public class Student extends User {
    String studentName;
    String gender;
    String procession;
    String grade;
    String counsellor;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProcession() {
        return procession;
    }

    public void setProcession(String procession) {
        this.procession = procession;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", procession='" + procession + '\'' +
                ", grade='" + grade + '\'' +
                ", counsellor='" + counsellor + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                '}';
    }
}
