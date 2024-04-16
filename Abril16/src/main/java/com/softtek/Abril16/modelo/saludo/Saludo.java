package com.softtek.Abril16.modelo.saludo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Saludo {
    private String bienvenida;

    public Saludo() {
        this.bienvenida = "Hello world!";
    }
}
