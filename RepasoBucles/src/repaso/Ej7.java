package repaso;

import java.util.Scanner;

public class Ej7 {
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.*/
	public static void main(String[] args) {
	
		int numUser;
		int cuentaP=0;
		int cuentaNeg=0;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 numeros separados por enter: ");
		for (int i=1; i<=10;i++) {
			numUser = lee.nextInt();
				if (numUser==0) {
					System.err.println("Por favor introduzca un numero distinto a 0.");
				}
			else if (numUser>0) {
					cuentaP++;
				}
				else {
					cuentaNeg++;
				}
			
		}
		System.out.println("Fueron introducidos " + cuentaP + " numeros positivos");
		System.out.println("Fueron introducidos " + cuentaNeg + " numeros negativos");

		lee.close();
	}

}
