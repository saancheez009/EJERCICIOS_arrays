package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tamaño;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el tamaño del array");
		tamaño=sc.nextInt();
		
		System.out.println("Por favor introduzca el número que aparecerá en el array");
		numero=sc.nextInt();
		
		int tabla[]= new int [tamaño]; 
			
		Arrays.fill(tabla, numero);
		
		System.out.println(Arrays.toString(tabla));
	
	}
}
