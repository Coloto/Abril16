package com.softtek.Abril16.modelo.informe;

import org.springframework.stereotype.Component;

@Component

public class InformeTrimestre1 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe del primer trimestre";
    }
}
