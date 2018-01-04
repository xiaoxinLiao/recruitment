package com.recruitment.dao;

import com.recruitment.entity.Resume;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 简历维护接口
 * @author xiaoxinliao
 * @date 2018/1/4 8:54
 */
@Repository
public interface ResumeDao {
    /**
     * 添加简历
     * @return
     */
    int add(@Param("candidateId")long candidateId,@Param("name") String name
    ,@Param("email") String email);

    /**
     * 查询所有
     * @return
     */
    List<Resume> queryAll();

    /**
     * 简历修改
     * @param
     * @return
     */
    int update(Resume resume);
}
