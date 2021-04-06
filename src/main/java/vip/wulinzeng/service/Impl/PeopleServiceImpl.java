package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.PeopleDao;
import vip.wulinzeng.pojo.People;
import vip.wulinzeng.service.PeopleService;

/*
@Name: PeopleServiceImpl
@Author: zhouhailin
@Date: 2021/4/6
@Time: 6:59 下午
@Description： 
*/
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    public PeopleDao peopleDao;

    @Override
    public int findcCount() {
        return peopleDao.findcCount();
    }

    @Override
    public int add(People people) {

        return peopleDao.add(people);
    }
}
