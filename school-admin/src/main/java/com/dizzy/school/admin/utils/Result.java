package com.dizzy.school.admin.utils;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    
    private Integer code;
    private String msg;
    private Object data;

    public static Result success() {
        return new Result(HttpStatus.OK.value(), "success", null);
    }

    public static Result success(Object data) {
        return new Result(HttpStatus.OK.value(), "success", data);
    }

    public static Result success(String msg, Object data) {
        return new Result(HttpStatus.OK.value(), msg, data);
    }

    public static Result fail() {
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(), "fail", null);
    }

    public static Result fail(String msg) {
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg, null);
    }
}
