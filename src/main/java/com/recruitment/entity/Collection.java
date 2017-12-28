package com.recruitment.entity;

/**
 * 用户浏览收藏表
 * @author xiaoxinliao
 * @date 2017/12/28 21:35
 */
public class Collection {

    /**
     * 普通用户id
     */
    private long candidateId;
    /**
     * 用户收藏的招聘信息表id
     */
    private long jobId;
    /**
     * 状态(0:我看过的简历,1:收藏,2:我投递的简历)
     */
    private short state;

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Collection() {

    }

    public Collection(long candidateId, long jobId, short state) {
        this.candidateId = candidateId;
        this.jobId = jobId;
        this.state = state;
    }
}
