package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Pedestrian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedestrianDao {

    private static final String collection = "pedestrian";

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 单个插入，指定集合
     * @param pedestrian
     *
     */
    public void saveOne(Pedestrian pedestrian){
        mongoTemplate.insert(pedestrian, collection);
    }

    public void saveBatch(List<Pedestrian> pedestrianList){
        mongoTemplate.insert(pedestrianList, collection);
    }

    public List<Pedestrian> findAll(){
        return mongoTemplate.findAll(Pedestrian.class, collection);
    }
}
