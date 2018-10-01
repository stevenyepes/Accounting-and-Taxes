package com.udea.edu.co.microservices.accounting.repository;

import com.udea.edu.co.microservices.accounting.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface AccountsRepository extends JpaRepository<Account, Long>{

    Account findByAccountNumber(String account);

}
