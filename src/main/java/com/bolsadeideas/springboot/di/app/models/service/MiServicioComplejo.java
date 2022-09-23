package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary //Para cuando tengo mas de una implementacion, esta es la que tomara al inyectar en Controlador
@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operation() {
		return "Haciendo operaciones complejas";
	}

}
