package com.example.MongodbDemo.domain;


import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable{

    private String name;
    private int age;
    private String des;
    private String sex;
    private StudentScore studentScore;
}
