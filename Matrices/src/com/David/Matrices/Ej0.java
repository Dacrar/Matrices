/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ej0 {

	/**
	 * Clase que pide una matriz por teclado y la muestra en pantalla
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Cuantas filas quieres?:");
		int filas = entrada.nextInt();
		
		System.out.println("Cuantas columnas quieres?:");
		int columnas = entrada.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		System.out.println("Introduce la Matriz");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		
	}

}
