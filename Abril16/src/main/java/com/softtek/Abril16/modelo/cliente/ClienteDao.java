package com.softtek.Abril16.modelo.cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDao {
    private IDao conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
