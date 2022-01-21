/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio4 {

	/**
	 * 4. Dado un array de tamaño (N,M) de reales, decir si la matriz así representada es 
		triangular superior. 
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
		

		
	
	int matriz[][]=new int[filas][columnas];
	
	Matrices.pedir_matriz(matriz);
	System.out.println("Tu matriz es:");
	Matrices.mostrar_matriz(matriz);
	boolean triangulo;
	triangulo =  Matrices.trianguloSuperior(matriz);
	
		if (triangulo)
			System.out.println("Trinagulo superior");
		else 
			System.out.println("No es trinagulo superior");
		

		

	}

}
