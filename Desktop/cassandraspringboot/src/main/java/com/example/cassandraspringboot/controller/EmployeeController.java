package com.example.cassandraspringboot.controller;

import com.example.cassandraspringboot.entity.Employee;
import com.example.cassandraspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private UserService userService;

    //-------------------------------------------------Create New User-------------------------------------------------
    @PostMapping("/employee")
    public Employee createUser(@Valid @RequestBody Employee emp) {

        return userService.createUser(emp);
    }

    //-------------------------------------------------Get All Users---------------------------------------------------
    @GetMapping("/employee")
    public List<Employee> getAllUsers() {

        return userService.getAllUsers();
    }

    //-----------------------------------------------Get User By ID ---------------------------------------------------
    @GetMapping(value = "/employee/{id}")
    public Employee getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    //-----------------------------------------------Update User By ID ------------------------------------------------
    @PutMapping(value = "/employee/{id}")
    public Employee updateUserById(@PathVariable("id") int id, @RequestBody Employee emp) {
        return userService.updateUserById(id, emp);
    }

    //-------------------------------------------------Delete User By ID ----------------------------------------------
    @DeleteMapping(value = "/employee/{id}")
    public String deleteUserById(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "Employee with id " + id + " has been deleted!";
    }
}


  /*  @PostConstruct
    public void saveUser() {
        List<User> users = new CopyOnWriteArrayList<>();
        users.add(new User(4, "David", "Johnson", "david@johnson.com", "#G4, Brooklyn Heights, Bangalore", "543216"));
        users.add(new User(5, "Emma", "Jones", "emma@jones.com", "#204, Brooklyn Heights, Bangalore", "543216"));
        userDAO.saveAll(users);
    }*/

