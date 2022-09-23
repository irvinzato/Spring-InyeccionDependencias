package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {
	
	private String name;
	
	private Integer price;

	public Producto(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
