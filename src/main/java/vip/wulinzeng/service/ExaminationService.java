package vip.wulinzeng.service;

import vip.wulinzeng.pojo.Examination;

import java.util.List;

public interface ExaminationService {

    public List<Examination> findall();

    public int add(Examination examination);

    public List<Examination> findOne(int id);

    public int delete(int id);

    public int edit(Examination examination);
}
