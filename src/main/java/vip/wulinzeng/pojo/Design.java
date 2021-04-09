package vip.wulinzeng.pojo;

import org.springframework.stereotype.Component;

/*
@Name: Design
@Author: zhouhailin
@Date: 2021/4/9
@Time: 9:25 上午
@Description： 设计
*/
@Component
public class Design {
    private int id;
    private String projectname;
    private String personname;
    private int worktime;

    public Design() {
    }

    public Design(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Design{" +
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
