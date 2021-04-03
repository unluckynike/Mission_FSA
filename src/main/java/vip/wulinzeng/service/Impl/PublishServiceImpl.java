package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.PublishDao;
import vip.wulinzeng.pojo.Publish;
import vip.wulinzeng.service.PublishService;

import java.util.List;

/*
@Name: PublishServiceImpl
@Author: zhouhailin
@Date: 2021/4/3
@Time: 4:23 下午
@Description： 
*/
@Service
public class PublishServiceImpl implements PublishService {

    @Autowired
    private PublishDao publishDao;

    @Override
    public List<Publish> findall() {
        return publishDao.findall();
    }

    @Override
    public int add(Publish publish) {
        return publishDao.add(publish);
    }
}
