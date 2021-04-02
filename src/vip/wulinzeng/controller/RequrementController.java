package vip.wulinzeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
@Name: RequrementController
@Author: zhouhailin
@Date: 2021/4/2
@Time: 4:55 下午
@Description： 
*/
@Controller
public class RequrementController {

    @RequestMapping("/requirement")
    public ModelAndView seeRequirement(ModelAndView modelAndView){
        System.out.println("requirement mapping get in");



        return modelAndView;
    }

}
