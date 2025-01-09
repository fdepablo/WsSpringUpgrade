package modelo.entidad;

public class Pelicula {
	private String titulo;
	private Director director;
	private Persona productor;
	
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
	
	public Persona getProductor() {
		return productor;
	}
	public void setProductor(Persona productor) {
		this.productor = productor;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", productor=" + productor + "]";
	}
	
	
	
	
}
