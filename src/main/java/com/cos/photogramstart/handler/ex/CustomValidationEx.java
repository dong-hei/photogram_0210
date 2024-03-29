package com.cos.photogramstart.handler.ex;

import java.util.Map;

public class CustomValidationEx extends RuntimeException{

    private final long serialVersionUID=1L;

    private Map<String, String> errorMap;

    public CustomValidationEx(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }
}
