package com.testCRUD.crud_test.dto;

public class UserUpdate {
    private String name;
    private String password;

    public UserUpdate(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UserUpdate() {
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
}
