package com.recruitment.service.impl;

import com.recruitment.entity.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author xiaoxinliao
 * @date 2018/1/4 11:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class ResumeServiceImplTest {
    @Autowired
    private ResumeServiceImpl resumeService;
    @Test
    public void update() throws Exception {
        Resume resume = new Resume("11111", (short) 1, new Date(),
                "add", (short) 1, 123214124, "sch",
                new Date(), "major", "des");
        resumeService.update(10L,resume);
    }

}