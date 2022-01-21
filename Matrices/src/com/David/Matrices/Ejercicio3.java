/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio3 {

	/**
	 * 
	 * 3. Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un número A dado.
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
		
		
		
		Matrices.pedir_matriz(matriz);
		System.out.println("Tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		
		int sumatorio;
		sumatorio = Matrices.contador(matriz,a);
		System.out.println("Hay "+ sumatorio+ " numeros igual al valor A");
		
		
		
		

	}

}
