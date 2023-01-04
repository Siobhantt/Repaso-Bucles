package repaso;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		int numUser;
		int negativos = 0;
		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca 10 numeros separados por enter: ");

		for (int i = 1; i <= 10; i++) {
			numUser = lee.nextInt();
			if (numUser < 0) {
				negativos++;
			}
		}
		System.out.print("De los 10 numeros introducidos " + negativos + " son negativos.");
	lee.close();
	}

}
