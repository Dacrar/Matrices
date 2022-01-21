/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio6 {

	/**
	 * 6. Dado un array de tama�o (N,M) de enteros, buscar el m�ximo valor almacenado. 
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
		
		int mayor = Matrices.mayorvalor(matriz);
		System.out.println("El mayor valor de la matriz es: "+ mayor);
		
	
		

	}

}
