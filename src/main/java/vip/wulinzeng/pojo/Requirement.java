package vip.wulinzeng.pojo;

/*
@Name: Requirement
@Author: zhouhailin
@Date: 2021/4/2
@Time: 7:21 下午
@Description： 需求  ——  第一道工序
*/

import org.springframework.stereotype.Component;

@Component
public class Requirement {

    private int id;//主键
    private String projectname;//项目名
    private String personname;//人名
    private int worktime;//工时

    //必须有无参构造方法
    public Requirement() {
//        System.out.println("!!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "Requirement{" +
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

    public Requirement(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }
}
