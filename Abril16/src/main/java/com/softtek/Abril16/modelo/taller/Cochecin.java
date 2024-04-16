package com.softtek.Abril16.modelo.taller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cochecin {
    private String matricula;
    private String modelo;
}
