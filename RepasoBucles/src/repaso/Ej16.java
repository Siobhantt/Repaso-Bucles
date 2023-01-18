package repaso;

import java.util.Scanner;

public class Ej16 {
/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no*/
	public static void main(String[] args) {
		boolean primo=true;
		int numUser;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		numUser=lee.nextInt();
		
		for(int i=2;i<numUser;i++) {//para verfificar si  es primo lo que hara el programa es dividir el numero introducido entre i
			//entonces
			if(numUser%i==0) {
				primo=false;
			}//fin del if
		}//fin del for
		
		System.out.println("El numero introducido es primo?:");
		System.out.println(primo);
	
	}

}
