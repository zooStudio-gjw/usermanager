package com.zoo.usermanager.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {



    private Integer id;

    private String name;
    private String oper_id;
    private Date oper_time;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column
    public String getOper_id() {
        return oper_id;
    }

    public void setOper_id(String oper_id) {
        this.oper_id = oper_id;
    }
    @Column
    public Date getOper_time() {
        return oper_time;
    }

    public void setOper_time(Date oper_time) {
        this.oper_time = oper_time;
    }
}
