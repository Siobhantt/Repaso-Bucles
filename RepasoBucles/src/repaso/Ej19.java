package repaso;

import java.util.Scanner;

public class Ej19 {
	/*
	 * Realiza un programa que lea un número y a continuación escriba el carácter
	 * “*” tantas veces igual al valor numérico leído. En aquellos casos en que el
	 * valor leído no sea positivo se deberá escribir un único asterisco.
	 */
	public static void main(String[] args) {

		int numUser;
		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();

		if (numUser < 0) {
			System.out.println("*");
		} else {
			for (int i = 1; i <= numUser; i++) {
				System.out.print("*");
			} // fin del for
		} // fin del if
	}
}
