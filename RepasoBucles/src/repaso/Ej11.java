package repaso;

public class Ej11 {
/*11. Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.*/
	public static void main(String[] args) {
		
		int sumaP=0;
		int sumaI=0;
		
		for (int i=100; i<=200;i++) {
			if (i%2==0) {
				sumaP+=i;
			}
			else if(i%2==1) {
				sumaI+=i;
			}
		}
		System.out.println("La suma de los numeros pares entre 100 y 200 es: " + sumaP);
		System.out.println("La suma de los numeros impares entre 100 y 200 es: " + sumaI);
	}

}
