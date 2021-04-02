package main.java.vip.wulinzeng.service.Impl;

import main.java.vip.wulinzeng.dao.RequirementDao;
import main.java.vip.wulinzeng.pojo.Requirement;
import main.java.vip.wulinzeng.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@Name: RequirementServiceImpl
@Author: zhouhailin
@Date: 2021/4/2
@Time: 7:41 下午
@Description： 
*/

@Service
public class RequirementServiceImpl implements RequirementService {

    @Autowired
    public RequirementDao requirementDao;

    @Override
    public List<Requirement> findall() {
        System.out.println("asdasd");
        System.out.println("findall: "+requirementDao.findall());
        return requirementDao.findall();
    }
}