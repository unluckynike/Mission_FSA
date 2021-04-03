package main.java.vip.wulinzeng.service;

import main.java.vip.wulinzeng.pojo.Requirement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequirementService {

    public List<Requirement> findall();
    public int add(Requirement requirement);

}
