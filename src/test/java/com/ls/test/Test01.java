package com.ls.test;

import com.ls.dao.UserDao;
import com.ls.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lostsakura
 * @create 2019-12-06 21:00
 */
public class Test01 {

    private ApplicationContext ctx = null;
    {
        ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test01() {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User userById = userMapper.getUserById(1);
        sqlSession.close();
        System.out.println(userById);
    }
}
