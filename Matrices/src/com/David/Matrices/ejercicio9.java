/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class ejercicio9 {

	/**
	 * 9. Dada un array de tamaño (M,N) de reales, almacenarlo sobre otro array de tamaño 
		  (N,M) de forma transpuesta, es decir, el elemento (1,2) del primer array se almacenará 
		  en el elemento (2,1) del segundo.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Cuantas filas quieres?:");
		int filas = entrada.nextInt();
		
		
		System.out.println("Cuantas columnas quieres?:");
		int columnas = entrada.nextInt();
		
		int matriz[][] = new int[filas][columnas];
		
		Matrices.pedir_matriz(matriz);
		System.out.println("Tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		
		int matriz2[][] = Matrices.matriztraspuesta(matriz);
		
		
		System.out.println();
		Matrices.mostrar_matriz(matriz2);
	}

}
