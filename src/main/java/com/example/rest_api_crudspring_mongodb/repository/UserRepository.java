package com.example.rest_api_crudspring_mongodb.repository;

import com.example.rest_api_crudspring_mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
