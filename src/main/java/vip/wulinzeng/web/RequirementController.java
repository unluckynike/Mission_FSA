package main.java.vip.wulinzeng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    /**
     * 需求 栅栏下内容
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/go",method = RequestMethod.GET)
    public ModelAndView seeRequirement(ModelAndView modelAndView){
        System.out.println("mapping getint ");
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public void add(
                    @RequestParam(value = "projectname",required = true)String projectname ,
                    @RequestParam(value = "personname",required = true)String personname,
                    @RequestParam(value = "worktingm",required = true)int worktingm,
                    ModelAndView modelAndView){

        System.out.println("messg:"+personname+"    "+projectname+"   "+"     "+worktingm);


    }

}
