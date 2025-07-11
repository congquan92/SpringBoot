package com.testCRUD.crud_test.exception;

public enum ErrorCode {
    USER_EXISTED(1001,"user existed"),
    USER_INVALID(1003,"user must be 3 characters"),
    IVALID_PASSWORD(1004,"password must be 6 characters"),
    IVALID_KEY(1005,"Error enum"),
    ;
    private int code;
    private String message;
    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
