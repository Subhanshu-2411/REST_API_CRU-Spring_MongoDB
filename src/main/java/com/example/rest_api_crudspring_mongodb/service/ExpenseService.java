package com.example.rest_api_crudspring_mongodb.service;

import com.example.rest_api_crudspring_mongodb.model.Expense;
import com.example.rest_api_crudspring_mongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpense(String id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
}
