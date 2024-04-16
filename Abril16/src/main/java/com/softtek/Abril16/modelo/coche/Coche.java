package com.softtek.Abril16.modelo.coche;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coche implements IVehiculo {
    @Value("100")
    private int deposito;

    @Override
    public String moverse() {
        if (deposito > 0){
            return "Vehiculo en movimiento";
        } else {
            return "El vehiculo no tiene combustible";
        }
    }
}
