package com.softProject.service.impl;

import com.softProject.mapper.DashboardMapper;
import com.softProject.pojo.Notify;
import com.softProject.pojo.PageBean;
import com.softProject.pojo.Student;
import com.softProject.pojo.Teacher;
import com.softProject.service.DashboardService;
import com.softProject.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DashboardServiceImpl implements DashboardService {
    private final SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public PageBean<Notify> selectByCondition(int currentPage, int pageSize, Notify notify) {
        int begin = (currentPage - 1) * pageSize;
        int size = pageSize;

        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        List<Notify> notifies = dashboardMapper.selectInNotifyByConditions(begin, size, notify);
        int totalPages = dashboardMapper.selectInNotifyCount(notify);

        PageBean<Notify> pageBean = new PageBean<>();
        pageBean.setTotalCount(totalPages);
        pageBean.setRows(notifies);

        sqlSession.close();
        return  pageBean;
    }

    @Override
    public Student selectByStudentId(int studentId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        Student student = dashboardMapper.selectByStudentId(studentId);

        sqlSession.close();
        return  student;
    }

    @Override
    public Teacher selectByTeacherId(int teacherId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        Teacher teacher = dashboardMapper.selectByTeacherId(teacherId);

        sqlSession.close();
        return teacher;
    }
}
