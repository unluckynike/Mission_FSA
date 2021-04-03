package vip.wulinzeng.service;

import org.springframework.stereotype.Service;
import vip.wulinzeng.pojo.Encode;

import java.util.List;

@Service
public interface EncodeService {

    public List<Encode> findall();
    public int add(Encode encode);

}
