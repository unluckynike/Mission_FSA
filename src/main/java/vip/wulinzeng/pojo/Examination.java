package vip.wulinzeng.pojo;

import org.springframework.stereotype.Component;

/*
@Name: Examination
@Author: zhouhailin
@Date: 2021/4/3
@Time: 4:00 下午
@Description： 测试 —— 第三道工序
*/
@Component
public class Examination {

    private int id;//主键
    private String projectname;//项目名
    private String personname;//人名
    private int worktime;//工时

    public Examination() {
    }

    public Examination(int id, String projectname, String personname, int worktime) {
        this.id = id;
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", personname='" + personname + '\'' +
                ", worktime=" + worktime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public Examination(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }




}
