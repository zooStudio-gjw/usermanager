package com.zoo.usermanager.dao;

import com.zoo.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {


    public User findByLoginNameAAndPassWord(String loginName,String passWord);
}
