package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		int tabla[]=new int[55];
		int inicio = 0;
		
		for (int i=0; i<=10;i++ ) {
				Arrays.fill(tabla,inicio, inicio+i, i);
				inicio=inicio+i;
		}
		System.out.println(Arrays.toString(tabla));
		
		
		
	

		
	}

}
