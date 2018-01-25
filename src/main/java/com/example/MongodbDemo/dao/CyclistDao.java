package com.example.MongodbDemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class CyclistDao {

    @Autowired
    private MongoTemplate mongoTemplate;

}
