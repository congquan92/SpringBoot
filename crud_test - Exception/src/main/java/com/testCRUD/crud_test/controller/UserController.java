package com.testCRUD.crud_test.controller;

import com.testCRUD.crud_test.dto.ApiResponse;
import com.testCRUD.crud_test.dto.UserDto;
import com.testCRUD.crud_test.dto.UserUpdate;
import com.testCRUD.crud_test.entity.User;
import com.testCRUD.crud_test.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ApiResponse<User> createUser(@RequestBody @Valid UserDto res) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
//        apiResponse.setCode(1000);
        apiResponse.setMessage("Created success !!");
        apiResponse.setData(userService.createResquest(res));
        return apiResponse;
    }
    @GetMapping("test")
    public String test() {
        return "test";
    }
    @GetMapping("/users")
    public ApiResponse<User>getAllUsers() {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        List<User> users = userService.getALL();
        apiResponse.setMessage("getAllUsers success !!");
        apiResponse.setData2(users);
        return apiResponse;
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
