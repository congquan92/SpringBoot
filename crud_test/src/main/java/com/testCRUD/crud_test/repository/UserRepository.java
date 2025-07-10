package com.testCRUD.crud_test.repository;

import com.testCRUD.crud_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    boolean existsUserByName(String name);
}
