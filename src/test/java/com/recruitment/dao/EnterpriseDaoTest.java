package com.recruitment.dao;

import com.recruitment.entity.Enterprise;
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
 * @date 2017/12/29 16:42
 */
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EnterpriseDaoTest {

    @Autowired
    private EnterpriseDao enterpriseDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void add() throws Exception {
        int count = enterpriseDao.add(
                new Enterprise("test1", "test",
                        "@qq.com","",137,"",(short)1));
        if (count > 0) {
            logger.info("count={}", count);
        } else {
            logger.error("添加失败");
        }
    }

    @Test
    public void queryByName() throws Exception {
        Enterprise enterprise = enterpriseDao.queryByName("ent");
        logger.info("Enterprise={}", enterprise);
    }

    @Test
    public void queryAll() throws Exception {
        List<Enterprise> enterpriseList = enterpriseDao.queryAll();
        logger.info("lenght={}",enterpriseList.size());
        logger.info("List<Enterprise>={}",enterpriseList);

    }

    @Test
    public void checkIdentity() throws Exception {
        Enterprise enterprise = enterpriseDao.checkIdentity("ent","ent");
        logger.info("checkIdentity:Enterprise={}", enterprise);
    }


}