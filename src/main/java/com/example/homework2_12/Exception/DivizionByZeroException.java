package com.example.homework2_12.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivizionByZeroException extends IllegalArgumentException {
    public DivizionByZeroException() {
        super("Ощибка: на ноль делить нельзя");
    }
}
