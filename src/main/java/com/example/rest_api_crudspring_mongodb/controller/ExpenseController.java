package com.example.rest_api_crudspring_mongodb.controller;

import com.example.rest_api_crudspring_mongodb.model.Expense;
import com.example.rest_api_crudspring_mongodb.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense> getExpenses() {
        return expenseService.getExpenses();
    }

    @GetMapping("/{id}")
    public Expense getExpense(@PathVariable("id") String id) {
        return expenseService.getExpense(id);
    }

    @PostMapping
    public Expense saveExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    @PutMapping("{id}")
    public Expense updateExpense(@PathVariable("id") String id, @RequestBody Expense expense) {
        expense.setId(id);
        return expenseService.updateExpense(expense);
    }

    @DeleteMapping("{id}")
    public void deleteExpense(@PathVariable("id") String id) {
        expenseService.deleteExpense(id);
    }
}
