/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio2 {

	/**
	 * 2. Dado un array de tama�o (N,M) de enteros, decir si todos sus elementos son cero.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Cuantas filas quieres?:");
		int filas = entrada.nextInt();
		
		
		System.out.println("Cuantas columnas quieres?:");
		int columnas = entrada.nextInt();
		
		int matriz[][]=new int[filas][columnas];

		
		Matrices.pedir_matriz(matriz);
		
		Matrices.mostrar_matriz(matriz);
		
		boolean ceros= Matrices.valor0(matriz);
		
		if (ceros) 
			System.out.println("Todos los elementos son cero");
		else 
			System.out.println("No son ceros");
		
		
	
		
		
		
		
		
		
	

	}

}
