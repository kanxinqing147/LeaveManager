package com.softProject.mapper;

import com.softProject.pojo.Notify;
import com.softProject.pojo.NotifyView;
import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DashboardMapper {
    List<Notify> selectInNotifyByConditions(@Param("begin") int begin, @Param("size") int size, @Param("notify") Notify notify);

    List<NotifyView> selectInNotifyViewByConditions(@Param("begin") int begin, @Param("size") int size, @Param("notifyView") NotifyView notifyView);

    int selectInNotifyCount(@Param("notify") Notify notify);

    int selectInNotifyViewCount(@Param("notifyView") NotifyView notifyView);

    Student selectByStudentId(@Param("studentId") int studentId);

    Teacher selectByTeacherId(@Param("teacherId") int teacherId);
}
