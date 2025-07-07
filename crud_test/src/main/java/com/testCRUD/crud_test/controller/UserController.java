package com.testCRUD.crud_test.controller;

import com.testCRUD.crud_test.dto.UserDto;
import com.testCRUD.crud_test.dto.UserUpdate;
import com.testCRUD.crud_test.entity.User;
import com.testCRUD.crud_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody UserDto res) {
        return userService.createResquest(res);
    }
    @GetMapping("test")
    public String test() {
        return "test";
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getALL();
    }
    @GetMapping("{id}")
    public User getUser(@PathVariable String id) {
        return userService.getOne(id);
    }
    @PutMapping("{id}")
    public User updateUser(@PathVariable String id, @RequestBody UserUpdate res) {
        return userService.updateOne(id, res);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteOne(id);
    }

}
