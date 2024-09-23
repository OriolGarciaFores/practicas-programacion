package com.example.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Test {

    private Long id;
    private String mensaje;

    public Test() {
        this.id = 1L;
        this.mensaje = "Mensaje default";
    }
}
