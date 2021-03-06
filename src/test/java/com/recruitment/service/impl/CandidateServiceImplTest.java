package com.recruitment.service.impl;

import com.recruitment.entity.Candidate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xiaoxinliao
 * @date 2017/12/29 15:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class CandidateServiceImplTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CandidateServiceImpl candidateService;

    @Test
    public void checkIdentity() throws Exception {
        Candidate candidate = candidateService.checkIdentity("", "1");

        assertEquals(null, candidate);

    }

    @Test
    public void add() throws Exception {
        int count = candidateService.add(new Candidate("TEST222","12","1"));
        assertEquals(1,count );
    }

    @Test
    public void queryByName() throws Exception {
        Candidate candidate = candidateService.queryByName("12");
        assertEquals(null,candidate );
    }

    @Test
    public void queryAll() throws Exception {
        List<Candidate> candidateList = candidateService.queryAll();
        logger.info("size={}",candidateList.size());
        for (Candidate candidate:candidateList){
            logger.info("Candidate={}",candidate);
        }
    }

}