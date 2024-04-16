package com.softtek.Abril16.modelo.taller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Cochecin c) {
        return "El coche con matricula " + c.getMatricula() + " está siendo reparado por el taller de mecanica";
    }
}
