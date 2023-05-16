package com.softProject.mapper;

import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    Student selectByIdInStudent(@Param("username") int username, @Param("password") String password);
    Teacher selectByIdInTeacher(@Param("username") int username, @Param("password") String password);
}
