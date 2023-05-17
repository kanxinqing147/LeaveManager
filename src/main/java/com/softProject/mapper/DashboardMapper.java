package com.softProject.mapper;

import com.softProject.pojo.Notify;
import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DashboardMapper {
    List<Notify> selectInNotifyByConditions(@Param("begin") int begin, @Param("size") int size, @Param("notify") Notify notify);

    int selectInNotifyCount(@Param("notify") Notify notify);

    Student selectByStudentId(@Param("studentId") int studentId);

    Teacher selectByTeacherId(@Param("teacherId") int teacherId);
}
