package com.testCRUD.crud_test.service;

import com.testCRUD.crud_test.dto.UserDto;
import com.testCRUD.crud_test.dto.UserUpdate;
import com.testCRUD.crud_test.entity.User;
import com.testCRUD.crud_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createResquest(UserDto request) {
        User user = new User();
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setBirthDate(request.getBirthDate());
        return userRepository.save(user);
    }

    public List<User> getALL() {
        return userRepository.findAll();
    }
    public User getOne(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }
    public User updateOne(String id, UserUpdate res) {
        User user = getOne(id);
        user.setName(res.getName());
        user.setPassword(res.getPassword());
        return userRepository.save(user);
    }
    public void deleteOne(String id) {
        userRepository.deleteById(id);
    }
}
