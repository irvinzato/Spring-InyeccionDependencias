package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	//Inyecta un objeto que pertenece al contenedor de Spring(Inyectar la interfaz es mejor)
	//@Qualifier("miServicioSimple")	//Inyecta a traves del nombre en anotaciones component
	@Autowired
	private IServicio service;
	
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", service.operation());
		
		return "index";
	}

}
