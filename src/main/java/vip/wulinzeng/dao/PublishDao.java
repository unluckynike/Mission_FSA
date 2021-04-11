package vip.wulinzeng.dao;

import vip.wulinzeng.pojo.Publish;

import java.util.List;

public interface PublishDao {

    public List<Publish> findall();

    public int add(Publish publish);

    public List<Publish> findOne(int id);

    public int delete(int id);

    public int edit(Publish publish);

    public void clean();

}
