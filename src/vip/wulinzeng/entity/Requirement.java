package vip.wulinzeng.entity;

/*
@Name: Requirement
@Author: zhouhailin
@Date: 2021/4/2
@Time: 4:53 下午
@Description： 
*/
public class Requirement {

    private int id;
    private String projectname;
    private String personname;
    private int worktime;

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

    public Requirement(int id, String projectname, String personname, int worktime) {
        this.id = id;
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }
}
