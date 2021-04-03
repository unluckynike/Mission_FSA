package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Examination;

import java.util.List;

public interface ExaminationService {

    public List<Examination> findall();

    public int add(Examination examination);
}
