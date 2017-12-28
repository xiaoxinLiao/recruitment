package com.recruitment.entity;

/**
 * 企业用户实体类
 *
 * @author xiaoxinliao
 * @date 2017/12/28 20:55
 */
public class Enterprise extends User {

    private long enterpriseId;

    /**
     * 地址
     */
    private String address;
    /**
     * 联系方式
     */
    private long tel;

    /**
     * 公司基本简介
     */
    private String syn;
    /**
     * 公司性质
     */
    private short type;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getSyn() {
        return syn;
    }

    public void setSyn(String syn) {
        this.syn = syn;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Enterprise() {
        super();
    }

    public Enterprise(String address, long tel, String syn, short type) {
        this.address = address;
        this.tel = tel;
        this.syn = syn;
        this.type = type;
    }

    public Enterprise(String userName, String password, String email, String address, long tel, String syn, short type) {
        super(userName, password, email);
        this.address = address;
        this.tel = tel;
        this.syn = syn;
        this.type = type;
    }
}
