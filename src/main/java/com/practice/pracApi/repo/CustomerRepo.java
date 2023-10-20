package com.practice.pracApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.pracApi.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
