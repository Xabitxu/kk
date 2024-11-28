package arrayListEjercicios;

import java.time.LocalDate;

public class Publicacion {
	protected LocalDate fecha;
	protected String titulo;
	
	public Publicacion(LocalDate fecha, String titulo) {
		this.fecha = fecha;
		this.titulo = titulo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Publicacion [fecha=" + fecha + ", titulo=" + titulo + "]";
	}
	
}
