package com.bank.repositories;

import com.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositories extends JpaRepository<Customer, Long> {
}
