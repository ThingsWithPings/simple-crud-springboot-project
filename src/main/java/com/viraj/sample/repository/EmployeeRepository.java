package com.viraj.sample.repository;

import com.viraj.sample.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends   CrudRepository <Employee,Long>{
}
