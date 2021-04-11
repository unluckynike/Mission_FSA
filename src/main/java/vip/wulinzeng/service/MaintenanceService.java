package vip.wulinzeng.service;

import org.springframework.stereotype.Service;
import vip.wulinzeng.pojo.Maintenance;

import java.util.List;

@Service
public interface MaintenanceService {

    public List<Maintenance> findall();

    public int add(Maintenance maintenance);

    public List<Maintenance> findOne(int id);

    public int delete(int id);

    public int edit(Maintenance maintenance);

    public void clean();


}
