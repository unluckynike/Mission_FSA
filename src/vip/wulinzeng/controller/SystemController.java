package vip.wulinzeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
@Name: SystemController
@Author: zhouhailin
@Date: 2021/4/2
@Time: 5:01 下午
@Description： 
*/
@Controller
public class SystemController {

    @RequestMapping("/index")
    public String seeIndex( ){
        System.out.println("index mapping get in");

        return "index";
    }

}
