package com.clh.controller;

import com.clh.bean.Applicant;
import com.clh.bean.Job;
import com.clh.bean.Score;
import com.clh.bean.User;
import com.clh.service.ApplicantService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ApplicantController {
    @Resource
    private ApplicantService applicantService;

    @RequestMapping("list")
    public String list(Model model, @RequestParam(defaultValue = "1")Integer cpage,String mohu1,String day1,String day2){
        Map map = new HashMap();
        map.put("mohu1",mohu1);
        map.put("day1",day1);
        map.put("day2",day2);

        PageHelper.startPage(cpage,3);
        List list  = applicantService.list(map);
        PageInfo pageInfo = new PageInfo(list);
        model.addAttribute("map",map);
        model.addAttribute("list",list);
        model.addAttribute("p",pageInfo);
        return "list";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("toLuru")
    public String toLuru(Integer aid, String aname){
        System.out.println(aid+aname);
        return "luru";
    }

//    listJob
    @RequestMapping("listJob")
    @ResponseBody
    public Object listJob(){
       List list =  applicantService.listJob();
       return list;
    }

    @RequestMapping("addScore")
    @ResponseBody
    public int addJob(Score score){

       int a =  applicantService.addScore(score);
       return a;
    }

    @RequestMapping("addApplicant")
    @ResponseBody
    public int addApplicant(Applicant applicant){

        int a =  applicantService.addApplicant(applicant);
        return a;
    }

    @RequestMapping("toXiu")
    public String toXiu(Integer aid){
        return "xiu";
    }
    //listOne


    @RequestMapping("listOne")
    @ResponseBody
    public Object listOne(Integer aid){
        List list = applicantService.listOne(aid);
        return list;
    }

//    xiuApplicant
    @RequestMapping("xiuApplicant")
    @ResponseBody
    public int xiuApplicant(Applicant applicant){
        int a = applicantService.xiuApplicant(applicant);
        return a;
    }
    @RequestMapping("delete")
    public String delete(Integer aid){
        int a = applicantService.delete(aid);
        return "redirect:list";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request, User user){
        User user1 = applicantService.login(user);

        if (user1 != null){
            request.getSession().setAttribute("user1",user1);
            return "redirect:list";
        }else {
            return "login";
        }


    }


    @RequestMapping("chaUser")
    @ResponseBody
    public int chaUser(String username){
        System.out.println(username+"///////////////////////");
       List list =  applicantService.chaUser(username);
       System.out.println(list+"-----------------------------------");
       if(list.size()>0) {
           return 1;
       }else {
           return 0;
       }

    }
    @RequestMapping("zc")
    @ResponseBody
    public int zc(User user){
        System.out.println("user*******************"+user);
       int a =  applicantService.zc(user);
       return a;
    }

}
