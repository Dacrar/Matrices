/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio1 {

	/**
	 * 	1. Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A.
	 * @param args
	 */
	public static void main(String[] args) {
	
	
		
	Scanner entrada = new Scanner (System.in);
	
	
	System.out.println("Cuantas filas quieres?:");
	int filas = entrada.nextInt();
	
	
	System.out.println("Cuantas columnas quieres?:");
	int columnas = entrada.nextInt();
	
	int matriz[][]=new int[filas][columnas];

	
	
	System.out.println("Cual es el valor de A");
	int a= entrada.nextInt();
	

	
	System.out.println("Tu matriz es:");
	Matrices.valor(matriz,a);
	
	Matrices.mostrar_matriz(matriz);
	
	
	
	}

}
