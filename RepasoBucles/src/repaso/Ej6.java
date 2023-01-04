package repaso;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de
	 * si ha leído algún número negativo o no.
	 */
	public static void main(String[] args) {
		int numUser;
		int contMinus = 0;

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca un numero: ");

		for (int i = 1; i <= 10; i++) {
			numUser = lee.nextInt();

			for (int j = i; j <= 10; j++) {
			}
			if (numUser < 0) {
				contMinus++;
			}
			if (numUser == 0) {
				System.err.println("Por favor introduzca un numero distinto a 0.");
				numUser = lee.nextInt();
			}
			if (numUser>0){ 
				System.out.println("No se introdujeron numeros negativos.");	
		}	
		}
		System.out.println("Se introdujeron " + contMinus + " numeros negativos");
	}

}
