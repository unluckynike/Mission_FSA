package vip.wulinzeng.dao;

import vip.wulinzeng.pojo.Encode;
import vip.wulinzeng.pojo.Examination;

import java.util.List;

public interface ExaminationDao {

    public List<Examination> findall();

    public int add(Examination examination);
}
