package com.softProject.service;

import com.softProject.pojo.Notify;
import com.softProject.pojo.PageBean;
import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;

public interface DashboardService {

    PageBean<Notify> selectByCondition(int currentPage, int pageSize, Notify notify);

    Student selectByStudentId(int studentId);

    Teacher selectByTeacherId(int teacherId);
}
