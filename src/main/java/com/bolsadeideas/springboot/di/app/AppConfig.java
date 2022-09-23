package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

//Otra forma de registrar componentes en contenedor de Spring
@Configuration
public class AppConfig {
/*	Los comente porque los registre en su propia clase de servicio
	@Bean("miServicioSimple")
	public IServicio registerMyService() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registerMyServiceHard() {
		return new MiServicioComplejo();
	}
*/
	
	@Bean("itemsFacturaDeporte")
	public List<ItemFactura> registerItemsSport() {
		Producto product1 = new Producto("Mancuernas 12kg", 4000);
		Producto product2 = new Producto("Barra Z", 9000);
		
		ItemFactura item1 = new ItemFactura(product1, 4);
		ItemFactura item2 = new ItemFactura(product2, 2);
		
		return Arrays.asList(item1, item2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registerItemsOffice() {
		Producto product1 = new Producto("Teclado mecanico", 1000);
		Producto product2 = new Producto("Mouse gamer", 800);
		Producto product3 = new Producto("Audifonos Onikuma", 400);
		
		ItemFactura item1 = new ItemFactura(product1, 2);
		ItemFactura item2 = new ItemFactura(product2, 5);
		ItemFactura item3 = new ItemFactura(product3, 3);
		
		return Arrays.asList(item1, item2, item3);
	}
	
}
