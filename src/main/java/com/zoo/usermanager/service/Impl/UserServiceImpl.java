package com.zoo.usermanager.service.Impl;

import com.zoo.usermanager.dao.IUserDao;
import com.zoo.usermanager.model.User;
import com.zoo.usermanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;



    public List<User> findAllUser(){
        return userDao.findAll();
    }

    public void insertUser(User user){
        user.setName("测试2019年8月3日23:09:55");
        user.setOper_id("gjw");
        user.setOper_time(new Date());
        userDao.save(user);
    }


}
