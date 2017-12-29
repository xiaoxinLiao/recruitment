package com.recruitment.dao;

import com.recruitment.entity.Candidate;
import org.springframework.stereotype.Repository;

/**
 * 普通用户DAO层
 *
 * @author xiaoxinliao
 * @date 2017/12/28 22:01
 */
@Repository
public interface CandidateDao extends UserDao<Candidate>  {




}
