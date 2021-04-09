package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.DesignDao;
import vip.wulinzeng.pojo.Design;
import vip.wulinzeng.service.DesignService;

import java.util.List;

/*
@Name: DesignServiceImpl
@Author: zhouhailin
@Date: 2021/4/9
@Time: 9:29 上午
@Description： 
*/
@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignDao designDao;

    @Override
    public List<Design> findall() {
        return designDao.findall();
    }

    @Override
    public int add(Design design) {
        return designDao.add(design);
    }
}
