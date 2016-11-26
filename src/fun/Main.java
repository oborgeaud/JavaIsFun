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
						System.out.println("1. monkeyTrouble");
						String monkeyTrouble = "We have two monkeys, a and b," 
								+ "\nand the parameters aSmile and bSmile indicate if each is smiling."
								+ "\nWe are in trouble if they are both smiling or if neither of them is smiling."
								+ "\nReturn true if we are in trouble. "
								+ "\n\tfuente: http://codingbat.com/prob/p181646";
						System.out.println(monkeyTrouble);

						monkeyTrouble monkeyTrouble1 = new monkeyTrouble();
						
						System.out.println("Today, both are smiling");
												
						System.out.println("We are in trouble? " + monkeyTrouble1.inTrouble(true, true));
						
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
		System.out.println("(Escribe -1 para salir)");
		
		System.out.println("\n-------------");
		
		System.out.println("\n1. monkeyTrouble");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");
		System.out.println("6. ");
		System.out.println("7. ");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("10. ");
		System.out.println("11. ");
		System.out.println("12. ");
		System.out.println("13. ");
		System.out.println("14. ");
		System.out.println("15 ");
				
		System.out.println("\n-------------");
		
	}
}
