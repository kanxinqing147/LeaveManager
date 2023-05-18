package com.softProject.service.impl;

import com.softProject.mapper.DashboardMapper;
import com.softProject.pojo.*;
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
    public PageBean<NotifyView> selectInNotifyViewByConditions(int currentPage, int pageSize, NotifyView notifyView) {
        int begin = (currentPage - 1) * pageSize;
        int size = pageSize;

        String studentName = notifyView.getStudentName();
        if (studentName != null && studentName.length() > 0) {
            notifyView.setStudentName("%" + studentName + "%");
        }
        String teacherName = notifyView.getTeacherName();
        if (teacherName != null && teacherName.length() > 0) {
            notifyView.setTeacherName("%" + teacherName + "%");
        }
        String actionDesc = notifyView.getActionDesc();
        if (actionDesc != null && actionDesc.length() > 0) {
            notifyView.setActionDesc("%" + actionDesc + "%");
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        List<NotifyView> notifyViews = dashboardMapper.selectInNotifyViewByConditions(begin, size, notifyView);
        int totalPages = dashboardMapper.selectInNotifyViewCount(notifyView);

        PageBean<NotifyView> pageBean = new PageBean<>();
        pageBean.setTotalCount(totalPages);
        pageBean.setRows(notifyViews);

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

    @Override
    public PageBean<Absence> selectInAbsenceByConditions(int currentPage, int pageSize, Absence absence) {
        int begin = (currentPage - 1) * pageSize;
        int size = pageSize;

        String studentName = absence.getStudentName();
        if (studentName != null && studentName.length() > 0) {
            absence.setStudentName("%" + studentName + "%");
        }
        String reason = absence.getReason();
        if (reason != null && reason.length() > 0) {
            absence.setReason("%" + reason + "%");
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        List<Absence> absences =  dashboardMapper.selectInAbsenceByConditions(begin, size, absence);
        int totalPages = dashboardMapper.selectInAbsenceByCount(absence);

        PageBean<Absence> pageBean = new PageBean<>();
        pageBean.setTotalCount(totalPages);
        pageBean.setRows(absences);

        sqlSession.close();
        return  pageBean;
    }

    @Override
    public void deleteByAbsenceIds(int[] ids) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);

        dashboardMapper.deleteByAbsenceIds(ids);

        sqlSession.commit();
        sqlSession.close();
    }
}
