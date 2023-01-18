package repaso;

import java.util.Scanner;

public class Ej17 {
	/*
	 * 17. Realiza un programa que lea y acepte únicamente aquellos que sean mayores
	 * que el último dado. La introducción de números finaliza con la introducción
	 * de un 0. Al final se mostrará: El total de números introducidos, excluido el
	 * 0. El total de números fallados.
	 */
	public static void main(String[] args) {
		int max=0;
		int min;
		int numUser;
		Scanner lee = new Scanner(System.in);

		System.out.println("Si desea salir del programa introduzca un 0");

		do {
			System.out.println("Por favor introduzca un numero: ");
			numUser = lee.nextInt();
			
			numUser=max;
			if (max<numUser) {
				
			}

		} while (numUser != 0);// fin del while

	}

}
