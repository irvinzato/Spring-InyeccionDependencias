package com.bolsadeideas.springboot.di.app.models.domain;

public class ItemFactura {
	
	private Producto product;
	
	private Integer amount;
	
	public ItemFactura(Producto product, Integer amount) {
		this.product = product;
		this.amount = amount;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer calculateTotal() {
		return product.getPrice() * amount;
	}

}
