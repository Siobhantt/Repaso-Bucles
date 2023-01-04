package repaso;

import java.util.Scanner;

public class Ej4 {
/*Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.*/
	public static void main(String[] args) {
		int numUser;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		
		numUser = lee.nextInt();
		
		for (int i=1; i<=numUser;i++) {
			System.out.println(i);
		}
		lee.close();
	}

}
