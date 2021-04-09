package vip.wulinzeng.service;

import org.springframework.stereotype.Service;
import vip.wulinzeng.pojo.Design;
import vip.wulinzeng.pojo.Encode;

import java.util.List;

@Service
public interface DesignService {

    public List<Design> findall();
    public int add(Design design);

}
