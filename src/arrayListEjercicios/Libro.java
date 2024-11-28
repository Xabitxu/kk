package arrayListEjercicios;

import java.time.LocalDate;

public class Libro extends Publicacion{
	private String isbn;
	private boolean premiado;
	
	public Libro(LocalDate fecha, String titulo, String isbn, boolean premiado) {
		super(fecha, titulo);
		this.isbn = isbn;
		this.premiado = premiado;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isPremiado() {
		return premiado;
	}

	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}

	@Override
	public String toString() {
		return super.toString()+"Libro [isbn=" + isbn + ", premiado=" + premiado + "]";
	}
	
	
	
	
	
}
