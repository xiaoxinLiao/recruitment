package com.recruitment.service;

import com.recruitment.entity.Resume;

import java.util.List;

/**
 * @author xiaoxinliao
 * @date 2018/1/4 10:21
 */
public interface IResumeService {


    /**
     *
     * @return
     */
    List<Resume> queryAll();

    /**
     *
     * @param resume
     * @return
     */
    int update(long candidateId,Resume resume);




}
