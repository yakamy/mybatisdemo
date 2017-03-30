package com.yakamy.mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.yakamy.mybatis.dao.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yakamy
 * @create 2017-03-30 12:55
 */
@Controller
public class UserController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @RequestMapping("/user")
    @ResponseBody
    public String user(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //User user = mapper.selectId(1L);

        User o = sqlSession.selectOne("com.yakamy.mybatis.dao.mapper.UserMapper.selectUser", 1L);
        PageHelper.startPage(1, 10);
        sqlSession.close();
        return "success";
    }
}
