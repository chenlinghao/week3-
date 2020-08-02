package com.clh.bean;

public class Score {
    private Integer aid;
    private Integer jid;
    private Integer score;

    @Override
    public String toString() {
        return "Score{" +
                "aid=" + aid +
                ", jid=" + jid +
                ", score=" + score +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Score() {
    }

    public Score(Integer aid, Integer jid, Integer score) {
        this.aid = aid;
        this.jid = jid;
        this.score = score;
    }
}
