package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Requirement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequirementService {

    public List<Requirement> findall();

    public int add(Requirement requirement);

    public int delete(int id);

    public List<Requirement> findOne(int id);

    public int edit(Requirement requirement);
}
