package com.udea.edu.co.microservices.accounting.controllers;


import com.udea.edu.co.microservices.accounting.entity.Cuenta;
import com.udea.edu.co.microservices.accounting.entity.User;
import com.udea.edu.co.microservices.accounting.repository.CuentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cuentas")
public class CuentasController {

    @Autowired
    CuentasRepository repository;

    @GetMapping
    public Iterable<Cuenta> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{cuenta}")
    public Cuenta find(@PathVariable("cuenta") String cuenta) {
        return repository.findByNumeroCuenta(cuenta);
    }


    @PostMapping(consumes = "application/json")
    public Cuenta create(@RequestBody Cuenta cuenta) {
        return repository.save(cuenta);
    }
}
