package com.recruitment.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaoxinliao
 * @date 2017/12/29 16:31
 */
public interface UserDao<T>  {
    /**
     * 检查用户名密码是否正确
     * @param userName
     * @param password
     * @return
     */
    T checkIdentity(@Param("userName") String userName,
                    @Param("password") String password);

    /**
     * 添加
     * @return
     */
    int add(T user);


    /**
     * 根据姓名查询
     * @param userName
     * @return
     */
    T queryByName(String userName);


    /**
     * 无条件检索
     * @return
     */
    List<T> queryAll();
}
