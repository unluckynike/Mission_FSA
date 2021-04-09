package vip.wulinzeng.dao;


import vip.wulinzeng.pojo.Design;
import vip.wulinzeng.pojo.Requirement;

import java.util.List;

public interface DesignDao {

    public List<Design> findall();

    public int add(Design design);

    public List<Design> findOne(int id);

    public int delete(int id);

    public int edit(Design design);
}
