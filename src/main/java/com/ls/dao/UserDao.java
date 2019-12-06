package com.ls.dao;

import com.ls.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author lostsakura
 * @create 2019-12-06 21:08
 */
public interface UserDao {
    /**
     * 根据id获取单个User实例
     * @param id
     */
    User getUserById(@Param("id") Integer id);
}
