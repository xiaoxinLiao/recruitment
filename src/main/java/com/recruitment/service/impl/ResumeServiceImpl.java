package com.recruitment.service.impl;

import com.recruitment.dao.EnterpriseDao;
import com.recruitment.dao.ResumeDao;
import com.recruitment.entity.Enterprise;
import com.recruitment.entity.Resume;
import com.recruitment.service.IResumeService;
import com.recruitment.utils.MyStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoxinliao
 * @date 2017/12/29 8:56
 */
@Service
public class ResumeServiceImpl implements IResumeService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ResumeDao resumeDao;


    public List<Resume> queryAll() {
        return resumeDao.queryAll();
    }

    public int update(long candidateId, Resume resume) {
        resume.setCandidateId(candidateId);
        return resumeDao.update(resume);
    }
}
