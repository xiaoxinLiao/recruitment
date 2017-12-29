package com.recruitment.service.impl;

import com.recruitment.dao.EnterpriseDao;
import com.recruitment.entity.Enterprise;
import com.recruitment.utils.MyStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业登录注册相关业务逻辑
 *
 * @author xiaoxinliao
 * @date 2017/12/29 8:56
 */
@Service
public class EnterpriseServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnterpriseDao enterpriseDao;


    /**
     * 检查账号(登录验证)
     *
     * @param userName 用户名
     * @param password 密码
     * @return Enterprise
     */
    public Enterprise checkIdentity(String userName, String password) {
        if (MyStringUtil.isEmpty(userName) || MyStringUtil.isEmpty(password)) {
            logger.error("字段不能为空");
            return null;
        }
        return enterpriseDao.checkIdentity(userName, password);
    }

    /**
     * 企业用户注册
     *
     * @param enterprise Enterprise
     * @return 0:失败 1： 成功
     */
    public int add(Enterprise enterprise) {

        if (enterpriseCheck(enterprise)) {
            logger.error("字段不能为空");
            return 0;
        } else if (enterpriseDao.queryByName(enterprise.getUserName()) != null) {
            logger.error("用户已存在");
            return 0;
        }
        return enterpriseDao.add(enterprise);
    }


    /**
     * 用户名验证
     *
     * @param userName 用户名
     * @return Enterprise
     */
    public Enterprise queryByName(String userName) {
        if (MyStringUtil.isEmpty(userName)) {
            logger.error("字段不能为空");
            return null;
        }
        return enterpriseDao.queryByName(userName);
    }

    /**
     * 查询所有
     *
     * @return List<Enterprise>
     */
    public List<Enterprise> queryAll() {
        return enterpriseDao.queryAll();
    }


    /**
     * 企业注册表单信息验证
     */
    private boolean enterpriseCheck(Enterprise enterprise) {
        String userName = enterprise.getUserName();
        String password = enterprise.getPassword();
        String email = enterprise.getEmail();
        String address = enterprise.getAddress();
        String syn = enterprise.getSyn();
        long tel = enterprise.getTel();
        short type = enterprise.getType();

        List<String> list = new ArrayList<String>();
        list.add(userName);
        list.add(password);
        list.add(email);
        list.add(address);
        list.add(syn);
        list.add(String.valueOf(tel));
        list.add(String.valueOf(type));

        for (String str : list) {
            if(MyStringUtil.isEmpty(str)){
                return true;
            }
        }
        return false;

    }

}
