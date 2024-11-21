package com.team62.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team62.springbootecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
