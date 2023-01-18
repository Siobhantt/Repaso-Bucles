package repaso;

import java.util.Scanner;

public class Ej15 {
/*5. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
*/
	public static void main(String[] args) {
		int numUser;
		int contador=0;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero a verificar: ");
		numUser=lee.nextInt();
		
		for (int i=1;i<=numUser;i++) {//debo recordar que para saber si un numero es multiplo de otro el resto de la division debe ser 0
			if(i%3==0) {
				contador++;
			}
		}
		System.out.println("la cantidad de multiplos de 3 en " + numUser + " es: " + contador);
	}

}
