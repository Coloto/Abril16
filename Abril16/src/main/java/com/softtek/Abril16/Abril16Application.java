package com.softtek.Abril16;

import com.softtek.Abril16.modelo.cliente.AccesoDesarrollo;
import com.softtek.Abril16.modelo.cliente.AccesoProduccion;
import com.softtek.Abril16.modelo.cliente.Cliente;
import com.softtek.Abril16.modelo.cliente.ClienteDao;
import com.softtek.Abril16.modelo.coche.Coche;
import com.softtek.Abril16.modelo.coche.Conductor;
import com.softtek.Abril16.modelo.informe.*;
import com.softtek.Abril16.modelo.saludo.Saludo;
import com.softtek.Abril16.modelo.taller.Cochecin;
import com.softtek.Abril16.modelo.taller.SeguroCoche;
import com.softtek.Abril16.modelo.taller.TallerMecanica;
import com.softtek.Abril16.modelo.taller.TallerPintura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {
	@Autowired
	Saludo saludar;

	@Autowired
	Conductor conductor;

	@Autowired
	TallerMecanica tallerMecanica;
	@Autowired
	TallerPintura tallerPintura;

	@Autowired
	InformeTrimestre1 informeTrimestre1;
	@Autowired
	InformeTrimestre2 informeTrimestre2;

	@Autowired
	AccesoDesarrollo accesoDesarrollo;
	@Autowired
	AccesoProduccion accesoProduccion;

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//saludar(saludar);
		//vehiculo(conductor);

		//tallerPintura(new SeguroCoche(tallerPintura, "aseguradora1"));
		//tallerMecanica(new SeguroCoche(tallerMecanica, "aseguradora2"));

		//informeJefe(new Jefe(informeTrimestre1));
		//informeDirector(new Director(informeTrimestre2));
		//informeSecretario(new Secretario(informeTrimestre2, "Softtek", "secretario@email.com"), informeTrimestre1);

		//clienteDesarrollo(new ClienteDao(accesoDesarrollo));
		//clienteProduccion(new ClienteDao(accesoProduccion));

	}

	public static void saludar(Saludo saludar){
		System.out.println(saludar.getBienvenida());
	}

	public static void vehiculo(Conductor conductor){
		System.out.println(conductor.conducir());
	}

	public static void tallerPintura(SeguroCoche seguroCoche){
		System.out.println(seguroCoche.reparar(new Cochecin("1212", "Modelo1")));
	}
	public static void tallerMecanica(SeguroCoche seguroCoche){
		System.out.println(seguroCoche.reparar(new Cochecin("3434", "Modelo2")));
	}

	public static void informeJefe(Jefe jefe){
		System.out.println(jefe.getInforme());
		System.out.println(jefe.getTarea());
	}
	public static void informeDirector(Director director){
		System.out.println(director.getInforme());
		System.out.println(director.getTarea());
	}
	public static void informeSecretario(Secretario secretario, IInforme informe){
		System.out.println(secretario.getInforme());
		secretario.setInforme(informe);
		System.out.println(secretario.getInforme());
	}

	public static void clienteDesarrollo(ClienteDao clienteDao){
		System.out.println(clienteDao.insertar(new Cliente("Paco", "1A")));
	}
	public static void clienteProduccion(ClienteDao clienteDao){
		System.out.println(clienteDao.insertar(new Cliente("Jesus", "2B")));
	}
}
