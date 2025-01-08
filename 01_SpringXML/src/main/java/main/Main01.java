package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class Main01 {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		//En este ejemplo vamos a trabajar con objetos dentro de Spring Context
		//y los vamos a dar de alta mediante XML
		//Los objetos gestionados por el contexto de spring se llaman "Beans"
		
		context = new ClassPathXmlApplicationContext("context01.xml");
		Persona p = (Persona)context.getBean("juan");
		p.setNombre("Juancho");
		p.setEdad(29);
		p.setPeso(150);
		
		imprimir();
		
		p = context.getBean("pepe",Persona.class);
		System.out.println(p);
		System.out.println("Fin del programa");

	}
	
	private static void imprimir() {
		Persona p = (Persona)context.getBean("juan");
		System.out.println(p);
		System.out.println(context.getBean("juan"));
	}

}
