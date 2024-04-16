package com.softtek.Abril16.modelo.informe;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Jefe implements IEmpleado{
    private IInforme informe;

    @Override
    public String getTarea() {
        return "Tareas de jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
