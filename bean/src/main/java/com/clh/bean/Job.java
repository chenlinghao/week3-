package com.clh.bean;

public class Job {
    private Integer jid;
    private String jname;
    private Integer require_edu;
    private Integer require_degree;
    private String intro;

    @Override
    public String toString() {
        return "Job{" +
                "jid=" + jid +
                ", jname='" + jname + '\'' +
                ", require_edu=" + require_edu +
                ", require_degree=" + require_degree +
                ", intro='" + intro + '\'' +
                '}';
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public Integer getRequire_edu() {
        return require_edu;
    }

    public void setRequire_edu(Integer require_edu) {
        this.require_edu = require_edu;
    }

    public Integer getRequire_degree() {
        return require_degree;
    }

    public void setRequire_degree(Integer require_degree) {
        this.require_degree = require_degree;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Job() {
    }

    public Job(Integer jid, String jname, Integer require_edu, Integer require_degree, String intro) {
        this.jid = jid;
        this.jname = jname;
        this.require_edu = require_edu;
        this.require_degree = require_degree;
        this.intro = intro;
    }
}
