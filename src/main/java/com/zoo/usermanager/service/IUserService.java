package com.zoo.usermanager.service;

import com.zoo.usermanager.model.User;

import java.util.List;

public interface IUserService {



    public List<User> findAllUser();

    public void insertUser(User user);
}
