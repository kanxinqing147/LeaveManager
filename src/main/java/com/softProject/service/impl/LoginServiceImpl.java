package com.softProject.service.impl;

import com.softProject.mapper.LoginMapper;
import com.softProject.pojo.User;
import com.softProject.service.LoginService;
import com.softProject.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class LoginServiceImpl implements LoginService {
    private final SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public boolean selectById(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        LoginMapper loginMapper = sqlSession.getMapper(LoginMapper.class);

        int userId = user.getUserId();
        String password = user.getPassword();
        boolean flag = loginMapper.selectByIdInStudent(userId, password) != null || loginMapper.selectByIdInTeacher(userId, password) != null;

        sqlSession.close();
        return flag;
    }
}
