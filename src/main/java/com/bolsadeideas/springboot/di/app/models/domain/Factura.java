package com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope	//En Spring si no se especifica es SingleTon por defecto V-630
public class Factura {
	
	@Value("${factura.descripcion}")
	private String description;
	
	@Autowired
	private Cliente client;
	
	@Autowired  //Creé listas en clase "AppConfig"
	@Qualifier("itemsFacturaOficina")	//Tambien puedo usar @Primary en Bean que quiera
	private List<ItemFactura> listItems;

	
	@PostConstruct
	public void init() {
		description = description.concat(" Modificado con ciclo de vida, anotacion @PostConstruct");
		client.setName(client.getName().concat(" Banderley"));
	}
	
	@PreDestroy
	public void finish() {
		System.out.println("Factura destruida con PreDestroy ".concat(description));
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public List<ItemFactura> getListItems() {
		return listItems;
	}

	public void setListItems(List<ItemFactura> listItems) {
		this.listItems = listItems;
	}
	
	

}
