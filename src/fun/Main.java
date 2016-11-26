package fun;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Una serie de algoritmos con la finalidad de practicar el lenguaje Java
 * y el versionado con git.
 * Probablemente encontraran muchos errores en el código o 
 * situaciones donde se escribe codigo de más. Estoy empezando !
*/
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
						
					case 2:
						System.out.println("2. altPairs");
						String altPairs = "Given a string, return a string made of" 
								+ "0,1, 4,5, 8,9 ... "
								+ "so 'kittens' yields 'kien'."
								+ "\n\t fuente: http://codingbat.com/prob/p121596";
						System.out.println(altPairs);
				}
			}
			
			catch (InputMismatchException ex) {
				System.out.println("Dame un número");
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
		
		System.out.println("\n\t\"No puedo enseñar nada a nadie. Solo puedo hacerlos pensar\"\n\tSócrates");
		System.out.println("\nSi fuerza quieres, seleccionar una opción debes.");
				
		System.out.println("\n-----------------");		
		System.out.println("1. monkeyTrouble");
		System.out.println("2. altPairs");
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
