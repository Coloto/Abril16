package com.softtek.Abril16.modelo.informe;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Secretario implements IEmpleado{
    private IInforme informe;
    private String empresa;
    private String email;

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTarea() {
        return "Tareas de secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
