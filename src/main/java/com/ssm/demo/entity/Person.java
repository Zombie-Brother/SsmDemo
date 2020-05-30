package com.ssm.demo.entity;

import lombok.Data;

@Data
public class Person {
    private long id;
    private String name;
    private String email;
    private int status;

    @Override
    public String toString(){
        return this.getId()+"---"+this.getName()+"---"+
                this.getEmail()+"---"+this.getStatus();
    }
}