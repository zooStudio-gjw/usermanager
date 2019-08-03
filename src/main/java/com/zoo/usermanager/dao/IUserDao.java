package com.zoo.usermanager.dao;

import com.zoo.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserDao extends JpaRepository<User, Integer> {


    public List<User> findAll();


}


