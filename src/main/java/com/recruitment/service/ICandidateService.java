package com.recruitment.service;

import com.recruitment.entity.Candidate;

import java.util.List;

/**
 * 普通用户接口类
 *
 * @author xiaoxinliao
 * @date 2017/12/29 14:53
 */
public interface ICandidateService {
    /**
     * 用户登录信息验证
     *
     * @param userName
     * @param password
     * @return
     */
    Candidate checkIdentity(String userName, String password);

    /**
     * 注册用户
     *
     * @param candidate
     * @return
     */
    int add(Candidate candidate);

    /**
     * 根据姓名查询
     *
     * @param userName
     * @return
     */
    Candidate queryByName(String userName);


    /**
     * 查询所有(无条件检索)
     *
     * @return
     */
    List<Candidate> queryAll();
}
