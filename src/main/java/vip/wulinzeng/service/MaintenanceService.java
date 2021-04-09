package vip.wulinzeng.service;

import org.springframework.stereotype.Service;
import vip.wulinzeng.pojo.Design;
import vip.wulinzeng.pojo.Maintenance;

import java.util.List;

@Service
public interface MaintenanceService {

    public List<Maintenance> findall();
    public int add(Maintenance maintenance);

}
