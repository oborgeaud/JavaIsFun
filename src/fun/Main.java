package fun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion;
		
		
		while (true) {
			
			menu();
			Scanner entrada = new Scanner(System.in);
			
			try {				
				opcion = entrada.nextInt();
				
				if (opcion == -1)
					break;
				
				switch (opcion) {				
					case 1:
						System.out.println("Algoritmo 1");
						break;				
				}
			}
			
			catch (InputMismatchException ex) {
				System.out.println("Dame un número");
				continue;
			}				
		}
	}

	public static void menu(){
		
		System.out.println("\n\t\"No puedo enseñar nada a nadie. Solo puedo hacerlos pensar.\"\n\tSócrates");
		System.out.println("\nSi fuerza quieres, seleccionar una opción debes.");
		System.out.println("Escribe -1 para salir.");
		
		System.out.println("\n-------------");
		
		System.out.println("\n1. La fuerza.");
		System.out.println("2. El miedo.");
		
		System.out.println("\n-------------");
		
	}
}
