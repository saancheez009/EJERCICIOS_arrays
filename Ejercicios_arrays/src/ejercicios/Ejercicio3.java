package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[]=new int[10];
		int tabla2[]=new int[10];	
		
		 for(int i=0;i<tabla.length;i++) {
				
		System.out.println("Por favor introduzca 20 valores enteros");
		tabla[i]=sc.nextInt();
		 }

		 for(int i=0;i<tabla2.length;i++) {
				
		System.out.println("Por favor introduzca 20 valores enteros");
		tabla2[i]=sc.nextInt();
		 }
		
		
			System.out.println(Arrays.toString(tabla));
		
			System.out.println(Arrays.toString(tabla2));
		
			System.out.println(Arrays.equals(tabla, tabla2));
			
	}
	

}
