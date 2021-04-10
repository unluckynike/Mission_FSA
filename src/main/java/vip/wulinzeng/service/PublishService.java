package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Publish;

import java.util.List;

public interface PublishService {
    public List<Publish> findall();

    public int add(Publish publish);

    public List<Publish> findOne(int id);

    public int delete(int id);

    public int edit(Publish publish);
}
