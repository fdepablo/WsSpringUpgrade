package modelo.entidad;

public class Pelicula {
	private String titulo;
	private Director director;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + "]";
	}
	
	
}
