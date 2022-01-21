/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio8 {

	/**
	 * 8. Dado un array de tamaño (3,3) de reales, obtener el determinante de la matriz así 
		  representada.
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
		
		} while (filas!=3 && columnas!=3);
		
		int matriz[][] = new int[filas][columnas];
		
		Matrices.pedir_matriz(matriz);
		System.out.println("Tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		
		int determinante = Matrices.matrizdeterminante(matriz);
		System.out.println("El resultado es "+ determinante);
	
	}

}
