package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple") //Service es lo mismo que Component pero mas descriptivo(Para tenerlo en contenedor de Spring)
public class MiServicio implements IServicio{
	
	@Override
	public String operation() {
		return "Haciendo operaciones simples...";
	}

}
