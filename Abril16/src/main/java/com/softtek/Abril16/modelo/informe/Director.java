package com.softtek.Abril16.modelo.informe;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
public class Director implements IEmpleado{
    private IInforme informe;

    @Override
    public String getTarea() {
        return "Tareas de director";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
