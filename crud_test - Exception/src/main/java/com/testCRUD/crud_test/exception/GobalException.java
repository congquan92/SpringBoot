package com.testCRUD.crud_test.exception;

import com.testCRUD.crud_test.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GobalException {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ApiResponse> runtimeException(RuntimeException e) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(apiResponse);
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        String enumkey =e.getFieldError().getDefaultMessage();

        ErrorCode errorCode = ErrorCode.IVALID_KEY;
        try {
            errorCode = ErrorCode.valueOf(enumkey);
        }catch (IllegalArgumentException iae) {

        }
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(errorCode.getMessage());
        apiResponse.setCode(errorCode.getCode());

        return ResponseEntity.badRequest().body(apiResponse);
    }

    @ExceptionHandler(value = AppException.class)
    public ResponseEntity<ApiResponse> handlingAppException(AppException e) {
       ErrorCode errorCode = e.getErrorCode();
        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setMessage(errorCode.getMessage());
        apiResponse.setCode(errorCode.getCode());

        return ResponseEntity.badRequest().body(apiResponse);
    }

}
