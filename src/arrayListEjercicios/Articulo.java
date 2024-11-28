package arrayListEjercicios;

import java.time.LocalDate;

public class Articulo extends Publicacion{
	private String medioPublicacion;

	
	public Articulo(LocalDate fecha, String titulo, String medioPublicacion) {
		super(fecha, titulo);
		this.medioPublicacion = medioPublicacion;
	}


	public String getMedioPublicacion() {
		return medioPublicacion;
	}


	public void setMedioPublicacion(String medioPublicacion) {
		this.medioPublicacion = medioPublicacion;
	}


	@Override
	public String toString() {
		return super.toString()+"Articulo [medioPublicacion=" + medioPublicacion + "]";
	}
	
	
	
}
