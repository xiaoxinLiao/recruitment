package com.recruitment.entity;

/**
 * 普通用户实体类
 *
 * @author xiaoxinliao
 * @date 2017/12/28 20:46
 */
public class Candidate extends User {
    /**
     * id
     */
    private long candidateId;

    public Candidate() {
    }

    public Candidate(String userName, String password, String email) {
        super(userName, password, email);
    }

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }


}
