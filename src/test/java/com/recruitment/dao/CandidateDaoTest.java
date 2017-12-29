package com.recruitment.dao;

import com.recruitment.entity.Candidate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author xiaoxinliao
 * @date 2017/12/29 11:23
 */
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CandidateDaoTest {


    @Autowired
    private CandidateDao candidateDao;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void addCandidate() throws Exception {
        int count = candidateDao.addCandidate(new Candidate("test", "test", "@qq.com"));
        if (count > 0) {
            logger.info("count={}", count);
        } else {
            logger.error("添加失败");
        }
    }

    @Test
    public void queryByName() throws Exception {
        Candidate candidate = candidateDao.queryByName("1");
        logger.info("Candidate={}", candidate);
    }

    @Test
    public void queryAll() throws Exception {
        List<Candidate> candidateList = candidateDao.queryAll();
        logger.info("lenght={}",candidateList.size());
        logger.info("List<Candidate>={}",candidateList);

    }

    @Test
    public void queryCandidate() throws Exception {
        Candidate candidate = candidateDao.queryCandidate("1","test");
        logger.info("queryCandidate:Candidate={}", candidate);
    }


}