package com.thymeleaf.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yu
 * on 2019/5/6.
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -3258839839160856614L;

    private Integer id;
    private String name;
    private String desc;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", date=" + date +
                '}';
    }
}
