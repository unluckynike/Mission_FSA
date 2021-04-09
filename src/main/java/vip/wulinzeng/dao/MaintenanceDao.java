package vip.wulinzeng.dao;


import vip.wulinzeng.pojo.Maintenance;

import java.util.List;

public interface MaintenanceDao {

    public List<Maintenance> findall();

    public int add(Maintenance maintenance);

}
