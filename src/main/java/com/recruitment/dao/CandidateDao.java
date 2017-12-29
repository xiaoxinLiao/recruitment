package com.recruitment.dao;

import com.recruitment.entity.Candidate;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 普通用户DAO层
 *
 * @author xiaoxinliao
 * @date 2017/12/28 22:01
 */
@Repository
public interface CandidateDao {

    /**
     * 检查用户名密码是否正确
     * @param userName
     * @param password
     * @return
     */
    Candidate queryCandidate(@Param("userName") String userName,
                             @Param("password") String password);

    /**
     * 添加
     * @param candidate
     * @return
     */
    int addCandidate(Candidate candidate);

//     /**
//      * 修改
//      */

    /**
     * 根据姓名查询
     * @param userName
     * @return
     */
    Candidate queryByName(String userName);


    /**
     * 无条件检索
     * @return
     */
    List<Candidate> queryAll();


}
