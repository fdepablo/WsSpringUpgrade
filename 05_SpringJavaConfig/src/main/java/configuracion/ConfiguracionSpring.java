package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;

@Configuration
public class ConfiguracionSpring {

	@Bean
	@Scope("prototype")
	public Director director() {
		Director d = new Director();
		d.setNombre("Steven Spielberg");
		return d;
	}
	
	@Bean
	@Scope("prototype")
	public Pelicula pelicula1(Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		pelicula.setGenero("Sci-Fi");
		return pelicula;
	}
}
