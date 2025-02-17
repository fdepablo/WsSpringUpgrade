package es.upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.modelo.entidad.Direccion;
import es.upgrade.modelo.entidad.Empleo;
import es.upgrade.modelo.entidad.Persona;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	@Autowired
	private Persona p2;
	
	//@Autowired
	//private GestorPersona gp;
	
	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println("Esto va despues del método run");
		
		Direccion d = new Direccion();
		d.setNombreVia("Gran Via");
		System.out.println(d.getNombreVia());
		System.out.println(d);
		
		Empleo e = new Empleo("Upgrade", 120000, false);
		e.getEmpresa();
		e.isBaja();
		System.out.println(e);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = context.getBean("persona",Persona.class);
		//gp.validar();
		System.out.println(p2);
		int suma = sumar(0);
		suma = sumar(0,1);
		suma = sumar(1,2,3,4,5,89);
		System.out.println(suma);
		
		sumarArray(new int[]{5,6,7});
	}
	
	public int sumar(int... numeros) {
		int resultado = 0;
		for(int i : numeros) {
			resultado += i;
		}
		return resultado;
	}
	
	public int sumarArray(int[] array) {
		return 0;
	}

}
