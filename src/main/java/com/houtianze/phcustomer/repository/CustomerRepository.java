package com.houtianze.phcustomer.repository;

import java.util.List;

import com.houtianze.phcustomer.model.Customer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// @CrossOrigin(origins = {"*"})
@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    // List<Customer> findAll();
}