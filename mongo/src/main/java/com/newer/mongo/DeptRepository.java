package com.newer.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends MongoRepository<Dept, String>{

}
