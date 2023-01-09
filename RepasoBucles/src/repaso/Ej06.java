package repaso;

import java.util.Scanner;

public class Ej06 {
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído
algún número negativo o no.*/
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
		//Importante
		if (negativos==0) {
			System.out.println("No se han encontrado numeros negativos");
		}
		else {
			System.out.println("Se ha encontrado al menos un numero negativo.");
		}
		
	lee.close();
	}

}
