package com.example.demo.sample;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserDao {
    private SqlSession sqlSession;
    public UserDao(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<HashMap<String, Object>> getUsers() {
        return sqlSession.selectList("com.example.demo.sample.UserMapper.selectUsers");
    }
}
