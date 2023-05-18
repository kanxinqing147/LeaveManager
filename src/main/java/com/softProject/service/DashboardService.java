package com.softProject.service;

import com.softProject.pojo.*;

public interface DashboardService {

    PageBean<Notify> selectByCondition(int currentPage, int pageSize, Notify notify);

    PageBean<NotifyView> selectInNotifyViewByConditions(int currentPage, int pageSize, NotifyView notifyView);

    Student selectByStudentId(int studentId);

    Teacher selectByTeacherId(int teacherId);

    PageBean<Absence> selectInAbsenceByConditions(int currentPage, int pageSize, Absence absence);

    void deleteByAbsenceIds(int[] ids);

    boolean insertAbsence(Absence absence);

    void updateAbsence(Absence absence);

    void updateStudent(Student student);
}
