package main;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;
import modelo.entidad.Persona;

public class Main04 {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context04.xml");

		@SuppressWarnings("unchecked")
		List<String> listaNombres = context.getBean("listaNombres",List.class);
		
		listaNombres.forEach(v -> System.out.println(v));
		
		@SuppressWarnings("unchecked")
		List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
		listaPersonas.forEach(v -> System.out.println(v));
		
		@SuppressWarnings("unchecked")
		Map<Integer, Persona> mapaPersonas = context.getBean("mapaPersonas", Map.class);
		
		mapaPersonas.forEach((k,v) -> {
			System.out.println("Clave: " + k + ", Valor: " + v);
		});
	}

}
