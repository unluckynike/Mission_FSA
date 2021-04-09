package vip.wulinzeng.dao;


import vip.wulinzeng.pojo.Requirement;

import java.util.List;

public interface RequirementDao {

    //查询所有
    public List<Requirement> findall();

    public int add(Requirement requirement);

    public int delete(int id);

}
