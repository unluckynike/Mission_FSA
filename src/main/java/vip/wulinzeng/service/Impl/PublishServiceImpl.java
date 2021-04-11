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

    @Override
    public List<Publish> findOne(int id) {
        return publishDao.findOne(id);
    }

    @Override
    public void clean() {
        publishDao.clean();
    }

    @Override
    public int delete(int id) {
        return publishDao.delete(id);
    }

    @Override
    public int edit(Publish publish) {
        return publishDao.edit(publish);
    }
}
