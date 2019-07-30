package com.zoo.usermanager.model;


import javax.persistence.*;

@Entity
public class User {


    private Integer user_id ;
    private String user_name ;
    private String loginName;
    private String passWord;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Column
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
