import java.util.Scanner;

public class CalculadoraApp {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		while (true) {

			System.out.println("**** Calculadora App ****");
			System.out.println();
			//llamamos a la funcion mostrarMenu()
			mostarMenu();
			try {
				System.out.print("Operacion: ");
				var op = Integer.parseInt(consola.nextLine());
				
				//llamamos a la funcion ejecutar operacion
				if (op >= 1 && op <= 4) 
					ejecutarOperacion(op, consola);
					
				
				else if (op == 5) {
					System.out.println("Hasta pronto...");
					break;
				}
				
				else {
					System.out.println("Operacion erronea: "+op);
				}


				System.out.println();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ocurrio un error: "+e.getMessage());
			}
			
		} // Fin while

	}// Fin Main
	
	public static void mostarMenu() {
		System.out.println("""
				1. Suma
				2. Resta
				3. Multiplicacion
				4. Division
				5. Salir
				""");
	}
	
	private static void ejecutarOperacion(int operacion, Scanner consola) {

			System.out.print("Operando1: ");
			var operando1 = Integer.parseInt(consola.nextLine());
			System.out.print("Operando2: ");
			var operando2 = Integer.parseInt(consola.nextLine());

			int resultado;

			switch (operacion) {
			case 1 -> {
				resultado = operando1 + operando2;
				System.out.println("Suma: " + resultado);
			}
			case 2 -> {
				resultado = operando1 - operando2;
				System.out.println("Resta: " + resultado);
			}
			case 3 -> {
				resultado = operando1 * operando2;
				System.out.println("Producto: " + resultado);
			}

			case 4 -> {
				resultado = operando1 / operando2;
				System.out.println("Division: " + resultado);
			}
			default -> System.out.println("Operacion Errónea: " + operacion);
			}


	}

}// Fin clase
