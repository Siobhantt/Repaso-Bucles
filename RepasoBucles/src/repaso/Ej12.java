package repaso;

import java.util.Scanner;

public class Ej12 {

	/*Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
	potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
	pantalla.*/
	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		int resultado=1;
		Scanner lee = new Scanner(System.in);
		
		System.out.print("Por favor introduzca el valor de A: ");
		valorA = lee.nextInt();
		
		System.out.print("Por favor introduzca el valor de B: ");
		valorB = lee.nextInt();
		
		for (int i=1; i<=valorB; i++) {
			
			resultado = valorA*resultado;
			
		}
		System.out.println(valorA + " elevado a " + valorB + " es igual a " + resultado);
		
		lee.close();
	}

}
