package com.recruitment.service.impl;

import com.recruitment.entity.Enterprise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author xiaoxinliao
 * @date 2017/12/29 18:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class EnterpriseServiceImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnterpriseServiceImpl enterpriseService;

    @Test
    public void checkIdentity() throws Exception {
        Enterprise enterprise = enterpriseService.checkIdentity("ent", "ent");

        assertEquals(Enterprise.class, enterprise.getClass());

    }

    @Test
    public void add() throws Exception {
        Enterprise enterprise = new Enterprise("tes", "test",
                "@qq.com", "1", 137, "1", (short) 1);
        int count = enterpriseService.add(enterprise);
        assertEquals(1, count);
    }

    @Test
    public void queryByName() throws Exception {
        Enterprise enterprise = enterpriseService.queryByName("12");
        assertEquals(null, enterprise);
    }

    @Test
    public void queryAll() throws Exception {
        List<Enterprise> candidateList = enterpriseService.queryAll();
        logger.info("size={}", candidateList.size());
        for (Enterprise enterprise : candidateList) {
            logger.info("Enterprise={}", enterprise);
        }
    }

}