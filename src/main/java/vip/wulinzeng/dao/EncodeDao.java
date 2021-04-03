package vip.wulinzeng.dao;


import vip.wulinzeng.pojo.Encode;

import java.util.List;

public interface EncodeDao {

    //查询所有
    public List<Encode> findall();

    public int add(Encode encode);

}
