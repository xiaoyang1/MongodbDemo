package com.example.MongodbDemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class PedestrianDao {

    @Autowired
    private MongoTemplate mongoTemplate;


}
