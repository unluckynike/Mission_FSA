package vip.wulinzeng.pojo;

import org.springframework.stereotype.Component;

/*
@Name: Publish
@Author: zhouhailin
@Date: 2021/4/3
@Time: 4:21 下午
@Description： 
*/
@Component
public class Publish {
    private int id;
    private String projectname;
    private String personname;
    private int worktime;

    public Publish() {
    }

    public Publish(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Publish{" +
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
