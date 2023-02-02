package repaso;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		int numUser;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		numUser = lee.nextInt();
		
		for(int i=1;i<=numUser;i++) {
			for(int j=1;j<=numUser;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
