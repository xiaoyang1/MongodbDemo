package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Student stu, String collection){
        mongoTemplate.save(stu, collection);
    }

//    public <T>List<T> findAll(String collection){
//        return mongoTemplate.findAll((Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0], collection);
//    }

    public List<Student> findAll(String collection){
        return mongoTemplate.findAll(Student.class, collection);
    }

    public List<Student> findByName(String name, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name));
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public List<Student> searchByNameAndDes(String name, String des, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name).and("des").is(des));
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public List<Student> searchByNameAndStudentScoreDes(String name, String des, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name).and("studentScore.des").is(des));
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public void update(Student stu, String collection){
        Query query = new Query(Criteria.where("name").is(stu.getName()));
        Update update = new Update().set("des",stu.getDes()).set("studentScore.des",stu.getStudentScore().getDes());
        //更新返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Student.class, collection);
        //更新查询返回的结果集的所有
        //mongoTemplate.updateMulti(query, update, Student.class, collection);
    }

    public void remove(String name, String collection){
        Query query = new Query(Criteria.where("name").is(name));
        mongoTemplate.remove(query, Student.class, collection);
    }
}
