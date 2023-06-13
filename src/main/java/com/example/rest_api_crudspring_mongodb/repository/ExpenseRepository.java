package com.example.rest_api_crudspring_mongodb.repository;

import com.example.rest_api_crudspring_mongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
