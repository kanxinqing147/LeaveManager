package com.softProject.mapper;

import com.softProject.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DashboardMapper {
    List<NotifyView> selectInNotifyViewByConditions(@Param("begin") int begin, @Param("size") int size, @Param("notifyView") NotifyView notifyView);

    int selectInNotifyViewCount(@Param("notifyView") NotifyView notifyView);

    Student selectByStudentId(@Param("studentId") int studentId);

    Teacher selectByTeacherId(@Param("teacherId") int teacherId);

    List<Absence> selectInAbsenceByConditions(@Param("begin") int begin, @Param("size") int size, @Param("absence") Absence absence);

    int selectInAbsenceByCount(@Param("absence") Absence absence);

    void deleteByAbsenceIds(@Param("ids") int[] ids);

    void insertAbsence(@Param("absence") Absence absence);

    void updateAbsence(@Param("absence") Absence absence);

    void updateStudent(@Param("student") Student student);

    void updateTeacher(@Param("teacher") Teacher teacher);
}
