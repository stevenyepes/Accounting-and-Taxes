package com.udea.edu.co.microservices.accounting.repository;

import com.udea.edu.co.microservices.accounting.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface CuentasRepository extends JpaRepository<Cuenta, Long>{

}
