package vip.wulinzeng.service.Impl;

import vip.wulinzeng.dao.RequirementDao;
import vip.wulinzeng.pojo.Requirement;
import vip.wulinzeng.service.RequirementService;
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
    private RequirementDao requirementDao;

    @Override
    public int add(Requirement requirement) {
        return requirementDao.add(requirement);
    }

    @Override
    public int edit(Requirement requirement) {
        return requirementDao.edit(requirement);
    }

    @Override
    public void clean() {
        requirementDao.clean();
    }

    @Override
    public List<Requirement> findOne(int id) {
        return requirementDao.findOne(id);
    }

    @Override
    public int delete(int id) {
        return requirementDao.delete(id);
    }

    @Override
    public List<Requirement> findall() {
        return requirementDao.findall();
    }
}
