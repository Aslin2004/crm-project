package com.example.crm.controller;

import com.example.crm.model.Customer;
import com.example.crm.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    // GET all
    @GetMapping
    public List<Customer> getAll() {
        return repo.findAll();
    }

    // GET by id
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable String id) {
        Optional<Customer> opt = repo.findById(id);
        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // CREATE
    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable String id, @RequestBody Customer customer) {
        return repo.findById(id).map(existing -> {
            existing.setName(customer.getName());
            existing.setEmail(customer.getEmail());
            existing.setPhone(customer.getPhone());
            Customer saved = repo.save(existing);
            return ResponseEntity.ok(saved);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        return repo.findById(id).map(existing -> {
            repo.deleteById(id);
            return ResponseEntity.ok("Customer deleted");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
