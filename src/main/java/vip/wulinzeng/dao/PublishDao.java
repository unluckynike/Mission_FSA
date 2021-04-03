package vip.wulinzeng.dao;

import vip.wulinzeng.pojo.Publish;
import vip.wulinzeng.pojo.Requirement;

import java.util.List;

public interface PublishDao {

    public List<Publish> findall();
    public int add(Publish publish);

}
