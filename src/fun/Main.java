package fun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion, respuesta = 0;		
		
		do {
			
			menu();
			Scanner entrada = new Scanner(System.in);
			
			try {				
				opcion = entrada.nextInt();
												
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
						System.out.println("\n#########################");	
						System.out.println("Today, both are smiling");												
						System.out.println("\nWe are in trouble?: " + monkeyTrouble1.inTrouble(true, true));
						System.out.println("#########################");	
						break;				
				}
			}
			
			catch (InputMismatchException ex) {
				System.out.println("Dame un n�mero");
				continue;
			}	
			
			try {
				System.out.println("\n\tPress any key to continue, - 1 to exit");
				respuesta = entrada.nextInt();
			}
			catch (InputMismatchException ex) {
				continue;
			}	
			
		} while (respuesta != -1);
	}

	public static void menu(){
		
		System.out.println("\n\t\"No puedo ense�ar nada a nadie. Solo puedo hacerlos pensar\"\n\tS�crates");
		System.out.println("\nSi fuerza quieres, seleccionar una opci�n debes.");
				
		System.out.println("\n-----------------");
		
		System.out.println("1. monkeyTrouble");
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
				
		System.out.println("------------------");
		
	}
}
