package com.softtek.Abril16.modelo.cliente;

import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements IDao{
    @Override
    public String insertar(Cliente c1) {
        return "Cliente " + c1.getNombre() + " insertado en produccion";
    }
}
