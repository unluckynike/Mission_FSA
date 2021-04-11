package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.EncodeDao;
import vip.wulinzeng.pojo.Encode;
import vip.wulinzeng.service.EncodeService;

import java.util.List;

/*
@Name: EncodeServiceImpl
@Author: zhouhailin
@Date: 2021/4/3
@Time: 2:18 下午
@Description： 
*/
@Service
public class EncodeServiceImpl implements EncodeService {

    @Autowired
    private EncodeDao encodeDao;

    @Override
    public List<Encode> findOne(int id) {
        return encodeDao.findOne(id);
    }

    @Override
    public int delete(int id) {
        return encodeDao.delete(id);
    }

    @Override
    public int edit(Encode encode) {
        return encodeDao.edit(encode);
    }

    @Override
    public List<Encode> findall() {
        return encodeDao.findall();
    }

    @Override
    public int add(Encode encode) {
        return encodeDao.add(encode);
    }

    @Override
    public void clean() {
        encodeDao.clean();
    }
}
