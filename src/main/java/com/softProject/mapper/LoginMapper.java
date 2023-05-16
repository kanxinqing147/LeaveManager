package com.softProject.mapper;

import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    Student selectByIdInStudent(@Param("userId") int userId, @Param("password") String password);
    Teacher selectByIdInTeacher(@Param("userId") int userId, @Param("password") String password);
}
