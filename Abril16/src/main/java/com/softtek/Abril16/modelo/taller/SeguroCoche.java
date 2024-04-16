package com.softtek.Abril16.modelo.taller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeguroCoche {
    private ITaller taller;

    private String aseguradora;

    public String reparar(Cochecin c){
        return taller.reparar(c);
    }
}
