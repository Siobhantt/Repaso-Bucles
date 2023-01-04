package repaso;

public class Ej9 {
/*Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales.*/
	public static void main(String[] args) {
		int suma=0;
		int producto=1;
		for (int i=1; i<=10;i++) {
			
			suma += i;
			producto*=i;
		}
		System.out.println("La suma de los 10 numero naturales es " + suma);
		System.out.println("El producto de los 10 numero naturales es " + producto);
	}

}
