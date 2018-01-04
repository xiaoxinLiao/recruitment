package com.recruitment.entity;


import java.util.Date;

/**
 * 简历对应实体类
 *
 * @author xiaoxinliao
 * @date 2017/12/28 21:04
 */
public class Resume {


    /**
     * 普通用户表的id
     */
    private long candidateId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别(0:男,1:女)
     */
    private short sex;
    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 居住地
     */
    private String email;

    /**
     * 学历
     */
    private short edu;
    /**
     * 手机
     */
    private long tel;
    /**
     * 毕业学校
     */
    private String sch;
    /**
     * 毕业年份
     */
    private Date year;
    /**
     * 专业
     */
    private String major;
    /**
     * 工作经验描述
     */
    private String des;

    public Resume(long candidateId, String name, short sex, Date birthday, String email, short edu, long tel, String sch, Date year, String major, String des) {
        this.candidateId = candidateId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.edu = edu;
        this.tel = tel;
        this.sch = sch;
        this.year = year;
        this.major = major;
        this.des = des;
    }
    public Resume(String name, short sex, Date birthday, String email, short edu, long tel, String sch, Date year, String major, String des) {

        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.edu = edu;
        this.tel = tel;
        this.sch = sch;
        this.year = year;
        this.major = major;
        this.des = des;
    }

    public Resume() {
    }

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getEdu() {
        return edu;
    }

    public void setEdu(short edu) {
        this.edu = edu;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getSch() {
        return sch;
    }

    public void setSch(String sch) {
        this.sch = sch;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
