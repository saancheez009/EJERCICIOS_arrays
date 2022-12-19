package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int tabla[]=new int [30];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=(int) (Math.random ()*10);
			System.out.println(tabla[i]);
			
			
		}
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));//[3, 7, 19, 23, 85]


	}

}
