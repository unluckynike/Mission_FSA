package vip.wulinzeng.service;

import org.springframework.stereotype.Service;
import vip.wulinzeng.pojo.Design;
import vip.wulinzeng.pojo.Encode;

import java.util.List;

@Service
public interface DesignService {

    public List<Design> findall();

    public int add(Design design);

    public List<Design> findOne(int id);

    public int delete(int id);

    public int edit(Design design);
    public void clean();

}
