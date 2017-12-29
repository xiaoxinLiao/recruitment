package com.recruitment.service.impl;

import com.recruitment.dao.CandidateDao;
import com.recruitment.entity.Candidate;
import com.recruitment.service.ICandidateService;
import com.recruitment.utils.MyStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 普通用户相关的Service
 *
 * @author xiaoxinliao
 * @date 2017/12/29 8:57
 */
@Service
public class CandidateServiceImpl implements ICandidateService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CandidateDao candidateDao;


    /**
     * 检查账号(登录验证)
     *
     * @param userName 用户名
     * @param password 密码
     * @return Candidate
     */
    public Candidate checkIdentity(String userName, String password) {
        if (MyStringUtil.isEmpty(userName) || MyStringUtil.isEmpty(password)) {
            logger.error("字段不能为空");
            return null;
        }
        return candidateDao.checkIdentity(userName, password);
    }

    /**
     * 普通用户注册
     *
     * @param candidate Candidate
     * @return 0:失败 1： 成功
     */
    public int add(Candidate candidate) {
        String userName = candidate.getUserName();
        String password = candidate.getPassword();
        String email = candidate.getEmail();
        if (MyStringUtil.isEmpty(userName) || MyStringUtil.isEmpty(password)
                || MyStringUtil.isEmpty(email)) {
            logger.error("字段不能为空");
            return 0;
        } else if (candidateDao.queryByName(userName) != null) {
            logger.error("用户已存在");
            return 0;
        }
        return candidateDao.add(candidate);
    }

    /**
     * 用户名验证
     *
     * @param userName 用户名
     * @return Candidate
     */
    public Candidate queryByName(String userName) {
        if (MyStringUtil.isEmpty(userName)) {
            logger.error("字段不能为空");
            return null;
        }
        return candidateDao.queryByName(userName);
    }

    /**
     * 查询所有
     *
     * @return List<Candidate>
     */
    public List<Candidate> queryAll() {
        return candidateDao.queryAll();
    }


}
