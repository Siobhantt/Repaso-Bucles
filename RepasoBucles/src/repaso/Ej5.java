package repaso;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		int numUser;
		int factorial=1;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		numUser= lee.nextInt();
		
		if (numUser==0) {
			factorial =1;
		}
		while(numUser!=0) {
		factorial = factorial*numUser;
		numUser--;
		}
		
		System.out.println("El factorial del numero introducido es : " +factorial);
	
	lee.close();
	
	}

}
