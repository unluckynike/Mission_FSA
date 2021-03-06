package vip.wulinzeng.pojo;

import org.springframework.stereotype.Component;

/*
@Name: Encoding
@Author: zhouhailin
@Date: 2021/4/3
@Time: 11:30 上午
@Description： 编码 -- 对应第二道工序
*/
@Component
public class Encode {

    private int id;//主键
    private String projectname;//项目名
    private String personname;//人名
    private int worktime;//工时

    public Encode() {
    }

    public Encode(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    public Encode(int id, String projectname, String personname, int worktime) {
        this.id = id;
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Encoding{" +
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
}
