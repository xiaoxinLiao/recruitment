package com.recruitment.service.impl;

import com.recruitment.dao.CandidateDao;
import com.recruitment.entity.Candidate;
import com.recruitment.service.ICandidateService;
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
public class CandidateService implements ICandidateService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CandidateDao candidateDao;

    /**
     * 检查账号(登录验证)
     *
     * @param userName
     * @param password
     * @return
     */
    public Candidate queryCandidate(String userName, String password) {
        if (isEmpty(userName) || isEmpty(password)) {
            logger.error("字段不能为空");
            return null;
        }
        return candidateDao.queryCandidate(userName, password);
    }

    /**
     * 普通用户注册
     *
     * @param candidate
     * @return
     */
    public int addCandidate(Candidate candidate) {
        String userName = candidate.getUserName();
        String password = candidate.getPassword();
        String email = candidate.getEmail();
        if (isEmpty(userName) || isEmpty(password) || isEmpty(email)) {
            logger.error("字段不能为空");
            return 0;
        } else if( candidateDao.queryByName(userName)!=null) {
            logger.error("用户已存在");
            return 0;
        }
        return candidateDao.addCandidate(candidate);
    }

    /**
     * 用户名验证
     *
     * @param userName
     * @return
     */
    public Candidate queryByName(String userName) {
        if (isEmpty(userName)) {
            logger.error("字段不能为空");
            return null;
        }
        return candidateDao.queryByName(userName);
    }

    /**
     * 查询所有
     * @return
     */
    public List<Candidate> queryAll() {
        return candidateDao.queryAll();
    }

    /**
     * 判读是否为null or 空串
     *
     * @param str
     * @return
     */
    private boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }
}
