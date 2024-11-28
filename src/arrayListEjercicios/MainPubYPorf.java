package arrayListEjercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class MainPubYPorf {
	
	public static int menu (Scanner sc) {
		int opcion;
		System.out.println("1. Introducir un nuevo profesor. ");
		System.out.println("2. Añadir publicación.");
		System.out.println("3. Mostrar los libros galardonados de un año concreto.");
		System.out.println("4. Mostrar un listado por departamento de los profesores con mayor número de publicaciones");
		System.out.println("5. Listado de los profes [0.25p]");
		System.out.println("6. Salir");
		opcion=sc.nextInt();
		
		return opcion;
	}
	
	
	public static void introducirProfesores (Scanner sc, ArrayList <Publicacion> p) {
		String email;
		
		System.out.println("Introducir email profesor: ");
		email=sc.next();
		
	}
	
	
	public static boolean validacionEmail (Scanner sc, ArrayList <Publicacion> p) {
		String regex = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]+$";
        return email.matches(regex);
	}
			
	public static void añadirPublicacion (Scanner sc, ArrayList <Publicacion> p) {
		String email;
		
		System.out.println("Introduce el email del profesor: ");
		email=sc.next();
		boolean encontrado=false;
		
		for (int i=0;i<p.size();i++) {
			if (p.get(i).getEmail().equalsIgnoreCase(email)) {
				encontrado=true;
			}
			
		}			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Publicacion> p= new ArrayList<Publicacion>();
		Scanner sc= new Scanner(System.in);
		int opcion;
		
		do {
		opcion=menu(sc);
			
		switch(opcion) {
		case 1:
			
			break;
		case 2:
			if (p.size()==0) {
				System.out.println("No hay profesores/publicaciones añadidos.");
			}
			else
				
			break;
		case 3:
			if (p.size()==0) {
				System.out.println("No hay profesores/publicaciones añadidos.");
			}
			else
				
			break;
		case 4:
			if (p.size()==0) {
				System.out.println("No hay profesores/publicaciones añadidos.");
			}
			else
			
			break;
		case 5:
			if (p.size()==0) {
				System.out.println("No hay profesores/publicaciones añadidos.");
			}
			else
			
			break;
		case 6:
			System.out.println("Adios!");
			break;	
		}	
		}while(opcion!=6);		
	}

}
