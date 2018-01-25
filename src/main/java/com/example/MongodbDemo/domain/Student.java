package com.example.MongodbDemo.domain;


import lombok.Data;
import org.ietf.jgss.Oid;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class Student implements Serializable{
    @Id
    private String _id;
    private String name;
    private int age;
    private String des;
    private String sex;
    private StudentScore studentScore;
}
