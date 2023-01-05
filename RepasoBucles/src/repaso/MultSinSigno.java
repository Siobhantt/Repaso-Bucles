package repaso;

public class MultSinSigno {

	public static void main(String[] args) {
		/*Es util entenderlo*/
		/*Se explicaba que una buena manera de verlo es como se le enseña a multiplicar a un niño.(Importante ver el debug)*/
		
		int a=3;
		int b=4;
		int resultado=0;
		
		for (int i=1;i<=b; i++) {
			
			resultado = a+resultado;
		}
		
		System.out.println("El resultado de multiplicar " + a + "*" + b + " es: " +  resultado);
	}

}
