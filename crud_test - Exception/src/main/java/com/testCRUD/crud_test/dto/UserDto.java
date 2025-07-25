package com.testCRUD.crud_test.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserDto {
    @Size(min = 3, message = "USER_INVALID")
    @NotEmpty(message = "thieu Username")
    private String name;
    @Size(min = 6, message = "IVALID_PASSWORD")
    @NotEmpty(message = "Thieu password")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public UserDto(String name, String password, String firstName, String lastName, LocalDate birthDate) {
        this.name = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

