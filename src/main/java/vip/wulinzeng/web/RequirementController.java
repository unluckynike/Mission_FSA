package main.java.vip.wulinzeng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Name: RequirementController
@Author: zhouhailin
@Date: 2021/4/2
@Time: 8:01 下午
@Description： 
*/
@RequestMapping("/requirement")
@Controller
public class RequirementController {

    @RequestMapping(value = "/go",method = RequestMethod.GET)
    public ModelAndView seeRequirement(ModelAndView modelAndView){
        System.out.println("mapping getint ");
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }

}
