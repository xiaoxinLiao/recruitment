package com.recruitment.entity;

import java.util.Date;

/**
 * 招聘信息实体类
 *
 * @author xiaoxinliao
 * @date 2017/12/28 21:18
 */
public class Job {

    /**
     * 招聘信息表id
     */
    private long jobId;
    /**
     * 企业用户表id
     */
    private long enterpriseId;

    /**
     * 工作经验要求
     */
    private String exp;
    /**
     * 学历要求
     */
    private short edu;
    /**
     * 待招人数
     */
    private int num;
    /**
     * 发布时间
     */
    private Date date;
    /**
     * 薪资
     */
    private double sal;
    /**
     * 福利
     */
    private String wel;

    /**
     * 职位
     */
    private String position;

    /**
     * 职位描述
     */
    private String des;
    /**
     * 工作地点
     */
    private String add;

    public Job( long enterpriseId, String exp,
               short edu, int num, Date date,
               double sal, String wel, String position,
               String des, String add) {
        this.enterpriseId = enterpriseId;
        this.exp = exp;
        this.edu = edu;
        this.num = num;
        this.date = date;
        this.sal = sal;
        this.wel = wel;
        this.position = position;
        this.des = des;
        this.add = add;
    }

    public Job() {
    }


    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public short getEdu() {
        return edu;
    }

    public void setEdu(short edu) {
        this.edu = edu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getWel() {
        return wel;
    }

    public void setWel(String wel) {
        this.wel = wel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
