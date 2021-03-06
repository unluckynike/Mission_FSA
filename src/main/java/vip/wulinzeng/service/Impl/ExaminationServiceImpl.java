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
    private ExaminationDao examinationDao;

    @Override
    public List<Examination> findall() {
        return examinationDao.findall();
    }

    @Override
    public int add(Examination examination) {
        return examinationDao.add(examination);
    }

    @Override
    public List<Examination> findOne(int id) {
        return examinationDao.findOne(id);
    }

    @Override
    public int delete(int id) {
        return examinationDao.delete(id);
    }

    @Override
    public int edit(Examination examination) {
        return examinationDao.edit(examination);
    }

    @Override
    public void clean() {
        examinationDao.clean();
    }
}
