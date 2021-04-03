package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.ExaminationDao;
import vip.wulinzeng.pojo.Examination;
import vip.wulinzeng.service.ExaminationService;

import java.util.List;

/*
@Name: ExaminationServiceImpl
@Author: zhouhailin
@Date: 2021/4/3
@Time: 4:03 下午
@Description： 
*/
@Service
public class ExaminationServiceImpl implements ExaminationService {

    @Autowired
    public ExaminationDao examinationDao;

    @Override
    public List<Examination> findall() {
        return examinationDao.findall();
    }

    @Override
    public int add(Examination examination) {
        return examinationDao.add(examination);
    }
}
