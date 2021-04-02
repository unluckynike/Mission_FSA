package main.java.vip.wulinzeng.web;

import main.java.vip.wulinzeng.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Name: SystemController
@Author: zhouhailin
@Date: 2021/4/2
@Time: 7:09 下午
@Description： 
*/
@RequestMapping("/system")
@Controller
public class SystemController {

    @Autowired
    public RequirementService requirementService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView module) {
        System.out.println("测试环境执行");
        module.addObject("testInfor", "添加成功");

         requirementService.findall();

        module.setViewName("system/index");
        return module;
    }

}
