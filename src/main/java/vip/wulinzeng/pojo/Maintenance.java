package vip.wulinzeng.pojo;

/*
@Name: Maintenance
@Author: zhouhailin
@Date: 2021/4/9
@Time: 9:45 上午
@Description： 维护
*/
public class Maintenance {
    private int id;
    private String projectname;
    private String personname;
    private int worktime;

    public Maintenance(String projectname, String personname, int worktime) {
        this.projectname = projectname;
        this.personname = personname;
        this.worktime = worktime;
    }

    public Maintenance() {
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", personname='" + personname + '\'' +
                ", worktime=" + worktime +
                '}';
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
