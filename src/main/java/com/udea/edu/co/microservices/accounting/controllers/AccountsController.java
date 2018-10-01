package com.udea.edu.co.microservices.accounting.controllers;	compile('org.springframework.boot:spring-boot-starter-jersey')



import com.udea.edu.co.microservices.accounting.entity.Account;
import com.udea.edu.co.microservices.accounting.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/accounts")
public class AccountsController {

    @Autowired
    AccountsRepository repository;

    @GetMapping
    public Iterable<Account> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{account}")
    public Account find(@PathVariable("account") String account) {
        return repository.findByAccountNumber(account);
    }


    @PostMapping(consumes = "application/json")
    public Account create(@RequestBody Account account) {
        return repository.save(account);
    }
}
