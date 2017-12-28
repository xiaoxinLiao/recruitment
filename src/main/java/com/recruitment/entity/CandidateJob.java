package com.recruitment.entity;

/**
 * 企业招聘
 *
 * @author xiaoxinliao
 * @date 2017/12/28 21:30
 */
public class CandidateJob {

    /**
     * 招聘信息表id
     */
    private long jobId;

    /**
     * 普通用户表id
     */
    private long candidateId;

    /**
     * 状态(0:未检阅,1:已检阅,2:录用)
     */
    private short state;

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }

    public int getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public CandidateJob(long jobId, long candidateId, short state) {
        this.jobId = jobId;
        this.candidateId = candidateId;
        this.state = state;
    }

    public CandidateJob(){}
}
