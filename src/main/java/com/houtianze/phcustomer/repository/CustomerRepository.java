package com.houtianze.phcustomer.repository;

import com.houtianze.phcustomer.model.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}