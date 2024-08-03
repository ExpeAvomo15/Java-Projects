import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos la lista de personas
		Scanner sc = new Scanner(System.in);
		
		List<Persona> personas = new ArrayList<>();
		
		var salir = false;
		
		while(!salir) {
			mostrarMenu();
			
			try {
				
				//llamamos a la funcio ejecutar operacion
				salir = ejecutarOperacion(sc, personas);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: "+e.getMessage());
			}
			
			
			
			
			System.out.println();
		}

	}
	
	private static void mostrarMenu() {
		System.out.println("""
				**** Listado Personas ****
				1. Agregar Persona
				2. Listar personas
				3. Salir
				""");
	}
	
	public static boolean ejecutarOperacion(Scanner sc, List<Persona>personas) {
		boolean salir = false;
		
		System.out.print("Opcion: ");
		var op = Integer.parseInt(sc.nextLine());
		
		switch(op) {
		case 1 ->{//Agregar a la lista
			System.out.print("Nombre: ");
			var nombre = sc.nextLine();
			System.out.print("Telefono: ");
			var tel = sc.nextLine();
			System.out.print("Email: ");
			var email = sc.nextLine();
			
			//Creamos un objeto Persona
			Persona p = new Persona(nombre, tel, email);
			//Añadimos a la lista
			personas.add(p);
			System.out.println("La lista tiene: "+personas.size()+ " Elementos");
		}
		
		case 2 ->{
			System.out.println("Lista de personas: ");
			personas.forEach(System.out::println);
			
		}
		
		case 3 ->{
			System.out.println("Hasta pronto...");
			salir = true;
		}
		
		default->{
			System.out.println("Opcion erronea: "+op);
		}
		
		
		}
		
		
		return salir;
	}

}
