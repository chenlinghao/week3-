package com.clh.bean;


import org.springframework.format.annotation.DateTimeFormat;

public class Applicant {
    private Integer aid;
    private String aname;
    private String gender;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday;
    private String college;
    private String major;
    private Integer edu;
    private Integer degree;
    private String created;

    @Override
    public String toString() {
        return "Applicant{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", edu=" + edu +
                ", degree=" + degree +
                ", created='" + created + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer geEdu() {
        return edu;
    }

    public void setEdu(Integer du) {
        this.edu = du;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Applicant() {
    }

    public Applicant(Integer aid, String aname, String gender, String birthday, String college, String major, Integer edu, Integer degree, String created) {
        this.aid = aid;
        this.aname = aname;
        this.gender = gender;
        this.birthday = birthday;
        this.college = college;
        this.major = major;
        this.edu = edu;
        this.degree = degree;
        this.created = created;
    }
}
