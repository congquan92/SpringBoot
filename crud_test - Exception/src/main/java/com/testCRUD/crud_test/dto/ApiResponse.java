package com.testCRUD.crud_test.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) // an cac json null
public class ApiResponse <T> {
    private int code = 1000;
    private String message;
    private T data;
    private List<T> data2;

    public List<T> getData2() {
        return data2;
    }

    public void setData2(List<T> data2) {
        this.data2 = data2;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
