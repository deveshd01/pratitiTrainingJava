package com.devesh.myMongoProject.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devesh.myMongoProject.Entiti.DemoEntity;

public interface DemoRepository extends MongoRepository<DemoEntity, String> {

}
