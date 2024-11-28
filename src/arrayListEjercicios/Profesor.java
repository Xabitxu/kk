package arrayListEjercicios;

import java.util.ArrayList;

public class Profesor {
	private String email;
	private String nombre;
	private String nombreDep;
	private ArrayList<Publicacion> p;
	
	public Profesor(String email, String nombre, String nombreDep, ArrayList<Publicacion> p) {
		this.email = email;
		this.nombre = nombre;
		this.nombreDep = nombreDep;
		this.p=new ArrayList<Publicacion>();
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public ArrayList<Publicacion> getP() {
		return p;
	}

	public void setP(ArrayList<Publicacion> p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Profesor [email=" + email + ", nombre=" + nombre + ", nombreDep=" + nombreDep + "]";
	}
	
	
	
	
}
