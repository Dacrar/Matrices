/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class ejerciciodni {

	/**
	 * 1. Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23,
	 *  el resultado debe estar entre 0 y 22. Haz un método que le pases el numero del DNI sin la letra y devuelva la letra, teniendo en cuenta las siguientes equivalencias:
	 *   T=0, R=1, W=2, A=3, G=4, M=5, Y=6, F=7, P=8, D=9, X=10, B=11, N=12, J=13, Z=14, S=15, Q=16, V=17, H=18, L=19, C=20, K=21, E=22, N=23. 
	 *   Por ejemplo, si introduzco 70588387, el resultado sera de 7 que corresponde a ‘F’.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el dni sin la letra");
		int dni = entrada.nextInt();
		
		 String dniconletra = Matrices.letradni(dni);
		 
		 
		 System.out.println("Tu dni con letra es: " + dniconletra );

		
		
		
		
		
		
	
		

	}

}
