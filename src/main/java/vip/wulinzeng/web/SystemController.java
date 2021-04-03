package vip.wulinzeng.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.RequestParam;
import vip.wulinzeng.pojo.User;
import vip.wulinzeng.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vip.wulinzeng.service.UserService;

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

    @Autowired(required = true)
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView module) {
        module.setViewName("system/index");
        return module;
    }

    /**
     * 登陆
     * @param username
     * @param password
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            ModelAndView modelAndView){
        User user=userService.finduser(username);
        if (user!=null){
            modelAndView.setViewName("system/welcome");
        }else {

            /**
             * 用户名错误处理
             */
        }
        return modelAndView;
    }

    //去后台系统首页
    @RequestMapping(value = "/gowelcome",method = RequestMethod.GET)
    public ModelAndView gowelcome(ModelAndView module) {
        System.out.println("测试环境执行");
        module.addObject("testInfor", "添加成功");
        module.setViewName("system/welcome");
        return module;
    }

}
