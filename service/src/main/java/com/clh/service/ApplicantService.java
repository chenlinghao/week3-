package com.clh.service;

import com.clh.bean.Applicant;
import com.clh.bean.Job;
import com.clh.bean.Score;
import com.clh.bean.User;

import java.util.List;
import java.util.Map;

public interface ApplicantService {
    List list(Map map);

    List listJob();

    int addScore(Score score);

    int addApplicant(Applicant applicant);

    List listOne(Integer aid);

    int xiuApplicant(Applicant applicant);

    int delete(Integer aid);


    User login(User user);

    List chaUser(String username);

    int zc(User user);
}
