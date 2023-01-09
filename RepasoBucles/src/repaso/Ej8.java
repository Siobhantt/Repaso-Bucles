package repaso;

import java.util.Scanner;

public class Ej8 {
	/*
	 * Realiza un programa que lea una secuencia de números no nulos hasta que se
	 * introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
	 * positivos y cuantos negativos.
	 */
	public static void main(String[] args) {

		int nUser;
		int contPos = 0;
		int contNeg = 0;
		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca numeros ");
		do {
			nUser = lee.nextInt();
			if (nUser > 0) {
				contPos++;
			} else {
				contNeg++;
			}
		} while (nUser != 0);

		if (contNeg>0) {
			System.out.println("Ha leido por lo menos un numero negativo");
		}
		
		System.out.println("Se introdujeron " + contPos + " numeros positivos.");
		System.out.println("Se introdujeron " + contNeg+ " numeros positivos.");
	}

}
