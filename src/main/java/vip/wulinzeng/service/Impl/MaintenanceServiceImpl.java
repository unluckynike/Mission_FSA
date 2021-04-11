package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.MaintenanceDao;
import vip.wulinzeng.pojo.Maintenance;
import vip.wulinzeng.service.MaintenanceService;

import java.util.List;

/*
@Name: MaintenanceServiceImpl
@Author: zhouhailin
@Date: 2021/4/9
@Time: 9:49 上午
@Description： 
*/
@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    MaintenanceDao maintenanceDao;

    @Override
    public List<Maintenance> findall() {
        return maintenanceDao.findall();
    }

    @Override
    public int add(Maintenance maintenance) {
        return maintenanceDao.add(maintenance);
    }

    @Override
    public List<Maintenance> findOne(int id) {
        return maintenanceDao.findOne(id);
    }

    @Override
    public void clean() {
        maintenanceDao.clean();
    }

    @Override
    public int delete(int id) {
        return maintenanceDao.delete(id);
    }

    @Override
    public int edit(Maintenance maintenance) {
        return maintenanceDao.edit(maintenance);
    }
}
