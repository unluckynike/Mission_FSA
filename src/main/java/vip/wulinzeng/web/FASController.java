package vip.wulinzeng.web;

import vip.wulinzeng.pojo.Requirement;
import vip.wulinzeng.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import vip.wulinzeng.pojo.Encode;
import vip.wulinzeng.service.EncodeService;

/*
@Name: RequirementController
@Author: zhouhailin
@Date: 2021/4/2
@Time: 8:01 下午
@Description： 
*/
@RequestMapping("/fas")
@Controller
public class FASController {

    @Autowired(required = true)
    public RequirementService requirementService;

    @Autowired(required = true)
      public EncodeService encodeService;

    /**
     * 需求 栅栏下内容
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/gorequirement", method = RequestMethod.GET)
    public ModelAndView seeRequirement(ModelAndView modelAndView) {
        System.out.println("mapping getin  ");
        System.out.println(requirementService.findall());
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }

    @RequestMapping(value = "/goencode", method = RequestMethod.GET)
    public ModelAndView seeEncode(ModelAndView modelAndView) {
        System.out.println("goencode mapping getin  ");
        System.out.println(requirementService.findall());
        modelAndView.setViewName("encode/encode_list");
        return modelAndView;
    }

    @RequestMapping(value = "/goexam", method = RequestMethod.GET)
    public ModelAndView seeExam(ModelAndView modelAndView) {
        System.out.println("goexam mapping getin  ");
        System.out.println(requirementService.findall());
        modelAndView.setViewName("exam/exam_list");
        return modelAndView;
    }

    @RequestMapping(value = "/prodect", method = RequestMethod.GET)
    public ModelAndView seeProdect(ModelAndView modelAndView) {
        System.out.println("prodect mapping getin  ");
        System.out.println(requirementService.findall());
        modelAndView.setViewName("prodect/prodect_list");
        return modelAndView;
    }

    @RequestMapping(value = "/fsaresult", method = RequestMethod.GET)
    public ModelAndView seeFSAResult(ModelAndView modelAndView) {
        System.out.println("fsaresult mapping getin  ");
        System.out.println(requirementService.findall());
        modelAndView.setViewName("result/fsaresult_list");
        return modelAndView;
    }

    /**
     *
     * @param projectname
     * @param personname
     * @param worktingm
     * @param modelAndView
     */
    @RequestMapping(value = "/addrequirementa", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addRequrement(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktingm", required = true) int worktingm,
            ModelAndView modelAndView) {
        //System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktingm);
        int flag = requirementService.add(new Requirement(projectname, personname, worktingm));
        if (flag > 0) {
            System.out.println("success");
           modelAndView.setViewName("encode/encode_list");//后续到编码
        } else {
            System.out.println("faild");
        }
        return modelAndView;
        /*
        请求错误处理……

         */
    }

    /**
     * 编码 第二道工序
     * @param projectname
     * @param personname
     * @param worktingm
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addencode", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addEncode(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktingm", required = true) int worktingm,
            ModelAndView modelAndView) {
        //System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktingm);

        int flag = encodeService.add(new Encode(projectname, personname, worktingm));
        if (flag > 0) {
            System.out.println("success");
            modelAndView.setViewName("exam/exam_list");//后续到测试
        } else {
            System.out.println("faild");
        }
        return modelAndView;
        /*
        请求错误处理……

         */
    }


}
