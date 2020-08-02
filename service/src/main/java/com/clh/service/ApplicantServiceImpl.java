package com.clh.service;

import com.clh.bean.Applicant;

import com.clh.bean.Score;
import com.clh.bean.User;
import com.clh.mapper.ApplicantMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ApplicantServiceImpl implements  ApplicantService{
    @Resource
    private ApplicantMapper applicantMapper;

    @Override
    public List list(Map map) {
        return applicantMapper.list(map);
    }

    @Override
    public List listJob() {
        return applicantMapper.listJob();
    }

    @Override
    public int addScore(Score score) {
        return applicantMapper.addScore(score);
    }

    @Override
    public int addApplicant(Applicant applicant) {
        return applicantMapper.addApplicant(applicant);
    }

    @Override
    public List listOne(Integer aid) {
        return applicantMapper.listOne(aid);
    }

    @Override
    public int xiuApplicant(Applicant applicant) {
        return applicantMapper.xiuApplicant(applicant);
    }

    @Override
    public int delete(Integer aid) {
        int a = applicantMapper.deleteScore(aid);
        return applicantMapper.delete(aid);
    }

    @Override
    public User login(User user) {
        return applicantMapper.login(user);
    }

    @Override
    public List chaUser(String username) {
        return applicantMapper.chaUser(username);
    }

    @Override
    public int zc(User user) {
        return applicantMapper.zc(user);
    }
}
