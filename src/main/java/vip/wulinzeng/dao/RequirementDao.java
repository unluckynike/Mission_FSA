package main.java.vip.wulinzeng.dao;


import main.java.vip.wulinzeng.pojo.Requirement;

import java.util.List;

public interface RequirementDao {

    //查询所有
    public List<Requirement> findall();

    public int add(Requirement requirement);

}
