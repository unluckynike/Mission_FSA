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

import javax.servlet.ServletRequest;
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
     *  总人数
     * @param modelAndView
     * @param request
     * @param peoplecount
     * @return
     */
    @RequestMapping(value = "/setpeople",method = RequestMethod.POST)
    public ModelAndView setPeopleTotal(ModelAndView modelAndView, HttpServletRequest request,
                                       @RequestParam(value = "peoplecount", required = true) int peoplecount){
        peopleService.add(new People(peoplecount));        //peoplecount come from input
        request.getSession().setAttribute("peopelCount",peoplecount);
        modelAndView.setViewName("design/design_list");
        return modelAndView;
    }

    /**
     * 栅栏下内容
     * @param modelAndView
     * @return
     */

    @RequestMapping(value = "/godesign",method = RequestMethod.GET)
    public ModelAndView seeDesign(ModelAndView modelAndView){
        System.out.println("godesigin mappting get in");
        modelAndView.setViewName("design/design_list");
        return modelAndView;
    }

    @RequestMapping(value = "/gorequirement", method = RequestMethod.GET)
    public ModelAndView seeRequirement(ModelAndView modelAndView) {
        System.out.println("mapping getin  ");
        modelAndView.setViewName("requirement/requirement_list");
        return modelAndView;
    }

    @RequestMapping(value = "/goencode", method = RequestMethod.GET)
    public ModelAndView seeEncode(ModelAndView modelAndView) {
        System.out.println("goencode mapping getin  ");
        modelAndView.setViewName("encode/encode_list");
        return modelAndView;
    }

    @RequestMapping(value = "/goexam", method = RequestMethod.GET)
    public ModelAndView seeExam(ModelAndView modelAndView) {
        System.out.println("goexam mapping getin  ");
        modelAndView.setViewName("exam/exam_list");
        return modelAndView;
    }

    @RequestMapping(value = "/gopublish", method = RequestMethod.GET)
    public ModelAndView seeProdect(ModelAndView modelAndView) {
        System.out.println("publish mapping getin  ");
        modelAndView.setViewName("publish/publish_list");
        return modelAndView;
    }

    @RequestMapping(value = "/gomaintenance",method = RequestMethod.GET)
    public ModelAndView seeMaintenance(ModelAndView modelAndView){
        modelAndView.setViewName("maintenance/maintenance_list");
        return modelAndView;
    }

    /**
     *  fsa
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/fsaresult", method = RequestMethod.GET)
    public ModelAndView seeFSAResult(ModelAndView modelAndView) {
        System.out.println("fsaresult mapping getin  ");
        modelAndView.setViewName("result/fsaresult_list");
        /**
         * fsa调度   出结果
         */

        return modelAndView;
    }


    //put in
    @RequestMapping(value = "/adddesign",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addDesign( @RequestParam(value = "projectname", required = true) String projectname,
                                   @RequestParam(value = "personname", required = true) String personname,
                                   @RequestParam(value = "worktime", required = true) int worktime,
                                   ModelAndView modelAndView){
        System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktime+"   ");
        int flag = designService.add(new Design(projectname, personname, worktime));
        if (flag > 0) {
            System.out.println("success");
            modelAndView.setViewName("requirement/requirement_list");//后续到需求
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    /**
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
        System.out.println("messg:" + personname + "    " + projectname + "   " + "     " + worktime+"   ");
        int flag = requirementService.add(new Requirement(projectname, personname, worktime));
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

    /**
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
            System.out.println("success");
            modelAndView.setViewName("publish/publish_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }


    /**
     * @param projectname
     * @param personname
     * @param worktime
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/addpublish",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addPublish(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView){
        int flag = publishService.add(new Publish(projectname, personname, worktime));
        if (flag > 0) {
            System.out.println("success");
//            PythonInterpreter interpreter = new PythonInterpreter();
//            interpreter.execfile("/Users/zhouhailin/PycharmProjects/pythonProject/bisai/GA.py ");
//
            modelAndView.setViewName("maintenance/maintenance_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/addmaintenance",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addMaintenance(
            @RequestParam(value = "projectname", required = true) String projectname,
            @RequestParam(value = "personname", required = true) String personname,
            @RequestParam(value = "worktime", required = true) int worktime,
            ModelAndView modelAndView){
        int flag = maintenanceService.add(new Maintenance(projectname, personname, worktime));
        if (flag > 0) {
            System.out.println("success");
            modelAndView.setViewName("design/design_list");
        } else {
            System.out.println("faild");
        }
        return modelAndView;
    }

    //query
    @RequestMapping(value = "/queryrequirement",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView queryRequirement(ModelAndView modelAndView){
        modelAndView.addObject("requirenments",requirementService.findall());
        modelAndView.setViewName("requirement/requirement_query");
        return modelAndView;
    }

    //delete
    @RequestMapping(value = "/deleterequirement",method = RequestMethod.GET)
    public String deleteRequirement(@RequestParam(value = "id") int deleteid, ModelAndView modelAndView){
        requirementService.delete(deleteid);
        return "redirect:/fas/queryrequirement";
    }

    //edit
    @RequestMapping(value = "/editrequirement",method = RequestMethod.GET)
    public ModelAndView goEditRequirement(@RequestParam(value = "id")int editid,ModelAndView modelAndView){
        modelAndView.addObject("requirementInfor",requirementService.findOne(editid));
        modelAndView.setViewName("requirement/requirement_edit");
        return modelAndView;
    }

    @RequestMapping(value = "/doeditrequirement",method = RequestMethod.POST)
    public String doEditeRequirement(@RequestParam(value = "id")int id,
                                     @RequestParam(value = "projectname", required = true) String projectname,
                                     @RequestParam(value = "personname", required = true) String personname,
                                     @RequestParam(value = "worktime", required = true) int worktime){
        System.out.println("di  : "+id);




        return "redirect:/fas/queryrequirement";
    }

}
