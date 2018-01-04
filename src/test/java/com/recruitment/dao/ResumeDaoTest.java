package com.recruitment.dao;

import com.recruitment.entity.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xiaoxinliao
 * @date 2018/1/4 9:24
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ResumeDaoTest {
    @Resource
    private ResumeDao resumeDao;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    @Test
    public void queryAll() throws Exception {
        List<Resume> resumeList = resumeDao.queryAll();
        logger.info("size={}",resumeList.size());
        logger.info("list={}",resumeList);
    }



}