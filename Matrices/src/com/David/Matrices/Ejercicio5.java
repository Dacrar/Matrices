/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio5 {

	/**
	 * 
	 * 5. Dado un array de tamaño (N,M), decir si la matriz así representada es triangular 
		  inferior
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int filas,columnas;
		
		
		do {
		System.out.println("Cuantas filas quieres?:");
		filas = entrada.nextInt();
		
		
		System.out.println("Cuantas columnas quieres?:");
		columnas = entrada.nextInt();
		
		} while (filas!=columnas); 
			
		
		
		int matriz[][] = new int[filas][columnas];
		
		
		Matrices.pedir_matriz(matriz);
		System.out.println("Tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		boolean triangulo;
		triangulo =  Matrices.trianguloInferior(matriz);
		
			if (triangulo)
				System.out.println("Trinagulo Inferior");
			else 
				System.out.println("No es trinagulo Inferior");
		

	}

}
