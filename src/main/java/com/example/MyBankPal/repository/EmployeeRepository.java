package com.example.MyBankPal.repository;

import com.example.MyBankPal.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
}
