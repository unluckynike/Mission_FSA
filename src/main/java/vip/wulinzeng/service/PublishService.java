package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Publish;

import java.util.List;

public interface PublishService {
    public List<Publish> findall();
    public int add(Publish publish);
}
