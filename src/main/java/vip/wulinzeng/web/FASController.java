package vip.wulinzeng.web;

import vip.wulinzeng.pojo.*;
import vip.wulinzeng.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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
    private DesignService designService;

    @Autowired(required = true)
    private RequirementService requirementService;

    @Autowired(required = true)
    private EncodeService encodeService;

    @Autowired(required = true)
    private ExaminationService examinationService;

    @Autowired(required = true)
    private PublishService publishService;

    @Autowired(required = true)
    private MaintenanceService maintenanceService;

    @Autowired(required = true)
    private PeopleService peopleService;


    /**
     * 总人数
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/gopeople", method = RequestMethod.GET)
    public ModelAndView seePeopleTotal(ModelAndView modelAndView) {
        System.out.println("gopeople mapping getin  ");
        modelAndView.setViewName("people/people_list");
        return modelAndView;
    }

    /**
     * 总人数
     *
     * @param modelAndView
     * @param request
     * @param peoplecount
     * @return
     */
    @RequestMapping(value = "/setpeople", method = RequestMethod.POST)
    public ModelAndView setPeopleTotal(ModelAndView modelAndView, HttpServletRequest request,
                                       @RequestParam(value = "peoplecount", required = true) int peoplecount) {
        peopleService.add(new People(peoplecount));        //peoplecount come from input
        modelAndView.addObject("requirenments", requirementService.findall());
        request.getSession().setAttribute("peopelCount", peoplecount);
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }


    /**
     * 清除数据
     *
     * @return
     */
    @RequestMapping(value = "/clean", method = RequestMethod.GET)
    public String clean() {
        requirementService.clean();
        designService.clean();
        encodeService.clean();
        examinationService.clean();
        publishService.clean();
        maintenanceService.clean();
        return "redirect:/system/gowelcome";
    }

    /**
     * 栅栏下内容
     *
     * @param modelAndView
     * @return
     */

    @RequestMapping(value = "/gorequirement", method = RequestMethod.GET)
    public ModelAndView seeRequirement(ModelAndView modelAndView) {
        modelAndView.addObject("requirenments", requirementService.findall());
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }

    @RequestMapping(value = "/godesign", method = RequestMethod.GET)
    public ModelAndView seeDesign(ModelAndView modelAndView) {
        modelAndView.addObject("designs", designService.findall());
        modelAndView.setViewName("design/design_list");
        return modelAndView;
    }


    @RequestMapping(value = "/goencode", method = RequestMethod.GET)
    public ModelAndView seeEncode(ModelAndView modelAndView) {
        modelAndView.addObject("encodes", encodeService.findall());
        modelAndView.setViewName("encode/encode_list");
        return modelAndView;
    }

    @RequestMapping(value = "/goexam", method = RequestMethod.GET)
    public ModelAndView seeExam(ModelAndView modelAndView) {
        modelAndView.addObject("exams", examinationService.findall());
        modelAndView.setViewName("exam/exam_list");
        return modelAndView;
    }

    @RequestMapping(value = "/gopublish", method = RequestMethod.GET)
    public ModelAndView seeProdect(ModelAndView modelAndView) {
        modelAndView.addObject("publishs", publishService.findall());
        modelAndView.setViewName("publish/publish_list");
        return modelAndView;
    }

    @RequestMapping(value = "/gomaintenance", method = RequestMethod.GET)
    public ModelAndView seeMaintenance(ModelAndView modelAndView) {
        modelAndView.addObject("maintenances", maintenanceService.findall());
        modelAndView.setViewName("maintenance/maintenance_list");
        return modelAndView;
    }

    /**
     * fsa
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/fsaresult", method = RequestMethod.GET)
    public ModelAndView seeFSAResult(ModelAndView modelAndView) {
        System.out.println("fsaresult mapping getin  ");
        modelAndView.setViewName("result/fsaresult_list");
        /*********************
         *** fsa调度   出结果***
         *********************/
        return modelAndView;
    }


    //add

    /**
     * 需求添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     */
    @RequestMapping(value = "/addrequirementa", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addRequrement(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView) {
        System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktime + "   ");
        int flag = requirementService.add(new Requirement(projectname, personname, worktime));
        if (flag > 0) {
            modelAndView.addObject("designs", designService.findall());
            modelAndView.setViewName("design/design_list");//后续到设计
        } else {
            System.out.println("faild");
        }
        return modelAndView;
        /*
        请求错误处理……

         */
    }

    /**
     * 设计添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/adddesign", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addDesign(@RequestParam(value = "projectname", required = true) String projectname,
                                  @RequestParam(value = "personname", required = true) String personname,
                                  @RequestParam(value = "worktime", required = true) int worktime,
                                  ModelAndView modelAndView) {
        System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktime + "   ");
        int flag = designService.add(new Design(projectname, personname, worktime));
        if (flag > 0) {
            modelAndView.addObject("encodes", encodeService.findall());
            modelAndView.setViewName("encode/encode_list");//后续到编码
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    /**
     * 编码添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addencode", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addEncode(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView) {
        System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktime);
        int flag = encodeService.add(new Encode(projectname, personname, worktime));
        if (flag > 0) {
            modelAndView.addObject("exams", examinationService.findall());
            modelAndView.setViewName("exam/exam_list");//后续到测试
        } else {
            System.out.println("faild");
        }
        return modelAndView;
        /*
        请求错误处理……

         */
    }

    /**
     * 测试添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addexamination", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addExamination(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView) {
        int flag = examinationService.add(new Examination(projectname, personname, worktime));
        if (flag > 0) {
            modelAndView.addObject("publishs", publishService.findall());
            modelAndView.setViewName("publish/publish_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }


    /**
     * 发布添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addpublish", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addPublish(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView) {
        int flag = publishService.add(new Publish(projectname, personname, worktime));
        if (flag > 0) {
            System.out.println("success");
            modelAndView.addObject("maintenances", maintenanceService.findall());
            modelAndView.setViewName("maintenance/maintenance_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    /**
     * 维护添加
     *
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addmaintenance", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addMaintenance(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView) {
        int flag = maintenanceService.add(new Maintenance(projectname, personname, worktime));
        if (flag > 0) {
            modelAndView.addObject("requirenments", requirementService.findall());
            modelAndView.setViewName("requirement/requirement_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    //query

    /**
     * 需求查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/queryrequirement", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryRequirement(ModelAndView modelAndView) {
        modelAndView.addObject("requirenments", requirementService.findall());
        modelAndView.setViewName("requirement/requirement_query");
        return modelAndView;
    }

    /**
     * 设计查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/querydesign", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryDesign(ModelAndView modelAndView) {
        System.out.println("findall desigin:" + designService.findall());
        modelAndView.addObject("designs", designService.findall());
        modelAndView.setViewName("design/design_query");
        return modelAndView;
    }


    /**
     * 编码查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/queryencode", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryEncode(ModelAndView modelAndView) {
        modelAndView.addObject("encodes", encodeService.findall());
        modelAndView.setViewName("encode/encode_query");
        return modelAndView;
    }

    /**
     * 测试查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/queryexam", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryExam(ModelAndView modelAndView) {
        modelAndView.addObject("exams", examinationService.findall());
        modelAndView.setViewName("exam/exam_query");
        return modelAndView;
    }

    /**
     * 发布查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/querypublish", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryPuhlish(ModelAndView modelAndView) {
        modelAndView.addObject("publishs", publishService.findall());
        modelAndView.setViewName("publish/publish_query");
        return modelAndView;
    }

    /**
     * 维护查询
     *
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/querymaintenance", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryMaintenance(ModelAndView modelAndView) {
        modelAndView.addObject("maintenances", maintenanceService.findall());
        System.out.println("maintenances findall: " + maintenanceService.findall());
        modelAndView.setViewName("maintenance/maintenance_query");
        return modelAndView;
    }

    //delete

    /**
     * 需求删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deleterequirement", method = RequestMethod.GET)
    public String deleteRequirement(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        requirementService.delete(deleteid);
        return "redirect:/fas/queryrequirement";
    }

    /**
     * 设计删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deletedesign", method = RequestMethod.GET)
    public String deleteDesign(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        designService.delete(deleteid);
        return "redirect:/fas/querydesign";
    }

    /**
     * 编码删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deleteencode", method = RequestMethod.GET)
    public String deleteEncode(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        encodeService.delete(deleteid);
        return "redirect:/fas/queryencode";
    }

    /**
     * 测试删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deleteexam", method = RequestMethod.GET)
    public String deleteExam(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        examinationService.delete(deleteid);
        return "redirect:/fas/queryexam";
    }

    /**
     * 发布删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deletepublish", method = RequestMethod.GET)
    public String deletePublish(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        publishService.delete(deleteid);
        return "redirect:/fas/querypublish";
    }

    /**
     * 维护删除
     *
     * @param deleteid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/deletemaintenance", method = RequestMethod.GET)
    public String deleteMaintenance(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView) {
        maintenanceService.delete(deleteid);
        return "redirect:/fas/querymaintenance";
    }

    //edit

    /**
     * 需求修改
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editrequirement", method = RequestMethod.GET)
    public ModelAndView goEditRequirement(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("requirementInfor", requirementService.findOne(editid));
        modelAndView.setViewName("requirement/requirement_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditrequirement", method = RequestMethod.POST)
    public String doEditRequirement(@RequestParam(value = "id") int id,
                                    @RequestParam(value = "projectname", required = true) String projectname,
                                    @RequestParam(value = "personname", required = true) String personname,
                                    @RequestParam(value = "worktime", required = true) int worktime) {
        requirementService.edit(new Requirement(id, projectname, personname, worktime));
        return "redirect:/fas/queryrequirement";
    }

    /**
     * 设计修改
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editdesign", method = RequestMethod.GET)
    public ModelAndView goEditeDesign(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("designInfor", designService.findOne(editid));
        modelAndView.setViewName("design/design_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditedesign", method = RequestMethod.POST)
    public String doEditeDesign(@RequestParam(value = "id") int id,
                                @RequestParam(value = "projectname", required = true) String projectname,
                                @RequestParam(value = "personname", required = true) String personname,
                                @RequestParam(value = "worktime", required = true) int worktime) {
        designService.edit(new Design(id, projectname, personname, worktime));
        return "redirect:/fas/querydesign";
    }

    /**
     * 编码修改
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editencode", method = RequestMethod.GET)
    public ModelAndView goEditDesign(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("encodeInfor", encodeService.findOne(editid));
        modelAndView.setViewName("encode/encode_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditencode", method = RequestMethod.POST)
    public String doEditDesign(@RequestParam(value = "id") int id,
                               @RequestParam(value = "projectname", required = true) String projectname,
                               @RequestParam(value = "personname", required = true) String personname,
                               @RequestParam(value = "worktime", required = true) int worktime) {
        encodeService.edit(new Encode(id, projectname, personname, worktime));
        return "redirect:/fas/queryencode";
    }


    /**
     * 测试修改
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editexam", method = RequestMethod.GET)
    public ModelAndView goEditExam(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("examInfor", examinationService.findOne(editid));
        modelAndView.setViewName("exam/exam_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditexam", method = RequestMethod.POST)
    public String doEditExam(@RequestParam(value = "id") int id,
                             @RequestParam(value = "projectname", required = true) String projectname,
                             @RequestParam(value = "personname", required = true) String personname,
                             @RequestParam(value = "worktime", required = true) int worktime) {
        examinationService.edit(new Examination(id, projectname, personname, worktime));
        return "redirect:/fas/queryexam";
    }

    /**
     * 发布修改
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editpublish", method = RequestMethod.GET)
    public ModelAndView goEditPublish(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("publishInfor", publishService.findOne(editid));
        modelAndView.setViewName("publish/publish_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditpublish", method = RequestMethod.POST)
    public String doEditPublish(@RequestParam(value = "id") int id,
                                @RequestParam(value = "projectname", required = true) String projectname,
                                @RequestParam(value = "personname", required = true) String personname,
                                @RequestParam(value = "worktime", required = true) int worktime) {
        publishService.edit(new Publish(id, projectname, personname, worktime));
        return "redirect:/fas/querypublish";
    }

    /**
     * 维护编辑
     *
     * @param editid
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/editmaintenance", method = RequestMethod.GET)
    public ModelAndView goEditMaintenance(@RequestParam(value = "id") int editid, ModelAndView modelAndView) {
        modelAndView.addObject("maintenanceInfor", maintenanceService.findOne(editid));
        modelAndView.setViewName("maintenance/maintenance_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditmaintenance", method = RequestMethod.POST)
    public String doEditMaintenance(@RequestParam(value = "id") int id,
                                    @RequestParam(value = "projectname", required = true) String projectname,
                                    @RequestParam(value = "personname", required = true) String personname,
                                    @RequestParam(value = "worktime", required = true) int worktime) {
        maintenanceService.edit(new Maintenance(id, projectname, personname, worktime));
        return "redirect:/fas/querymaintenance";
    }

}
