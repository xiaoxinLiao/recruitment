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
public class CandidateServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CandidateService candidateService;

    @Test
    public void queryCandidate() throws Exception {
        Candidate candidate = candidateService.queryCandidate("", "1");

        assertEquals(null, candidate);

    }

    @Test
    public void addCandidate() throws Exception {
        int count = candidateService.addCandidate(new Candidate("12","12","1"));
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