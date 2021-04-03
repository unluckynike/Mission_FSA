package vip.wulinzeng.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.wulinzeng.dao.UserDao;
import vip.wulinzeng.pojo.User;
import vip.wulinzeng.service.UserService;

/*
@Name: UserServiceImpl
@Author: zhouhailin
@Date: 2021/4/3
@Time: 10:23 下午
@Description： 
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User finduser(String username) {
        return userDao.finduser(username);
    }
}
