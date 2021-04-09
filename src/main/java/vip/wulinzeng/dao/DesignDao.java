package vip.wulinzeng.dao;


import vip.wulinzeng.pojo.Design;

import java.util.List;

public interface DesignDao {

    public List<Design> findall();

    public int add(Design design);

}
