package repaso;

import java.util.Scanner;

public class Ej10 {
	/*
	 * Realiza un programa que lea una secuencia de notas (con valores que van de 0
	 * a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con
	 * valor 10.
	 */
	public static void main(String[] args) {

		int notaUser;

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca sus notas(contempladas del 0 al 10.)");
		System.out.println("Si desea terminar introduzca un -1.");

		do {
			notaUser = lee.nextInt();

			if (notaUser == -1) {
				break;
			}

			else if (notaUser < 0 || notaUser > 10) {
				System.err.println("Por favor introduzca una nota valida.");
			}
			else if (notaUser ==10) {
				System.out.println("Hay al menos un 10 en las notas introducidas.");
			}

		} while (notaUser != -1);
	lee.close();
	}

}
