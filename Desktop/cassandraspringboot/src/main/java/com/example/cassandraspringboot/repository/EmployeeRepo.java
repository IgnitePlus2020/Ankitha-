package com.example.cassandraspringboot.repository;

import com.example.cassandraspringboot.entity.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepo extends CassandraRepository<Employee, Integer> {


}