package com.example.cassandraspringboot.service;

import com.example.cassandraspringboot.entity.Employee;

import com.example.cassandraspringboot.exceptions.EmployeeNotFoundException;
import com.example.cassandraspringboot.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private EmployeeRepo employeeRepo;

    //-------------------------------------------------Create New User-------------------------------------------------
    public Employee createUser(Employee emp) {

        return employeeRepo.save(emp);
    }

    //-------------------------------------------------Get All Users---------------------------------------------------
    public List<Employee> getAllUsers() {

        return employeeRepo.findAll();
    }

    //-----------------------------------------------Get User By ID ---------------------------------------------------
    public Employee getUserById(int id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("User Record with id " + id + " is not available");
        return employeeRepo.findById(id).get();
    }

    //-----------------------------------------------Update User By ID ------------------------------------------------
    public Employee updateUserById(int id, Employee emp) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("User Record with id " + id + " is not available");
        emp.setEmpId(id);
        return employeeRepo.save(emp);
    }

    //-------------------------------------------------Delete User By ID ----------------------------------------------
    public void deleteUserById(int id) {
        Optional<Employee> optionalUser = employeeRepo.findById(id);
        if (!optionalUser.isPresent())
            throw new EmployeeNotFoundException("User Record with id " + id + " is not available");
        employeeRepo.deleteById(id);
    }
}

