/**
 * 
 */
package com.David.Matrices;

import java.util.Scanner;

/**
 * Metodo que pide una matriz por teclado
 * @author David
 *
 */
public class Matrices {

	public static void pedir_matriz(int matriz[][]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d): ", i,j);
				matriz[i][j] = entrada.nextInt();
			}
		}
}

	public static void mostrar_matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			System.out.printf("%3d", matriz[i][j]);
			}
		System.out.println();
		}
	}	
	
	
	/* Darle un valor llamado a y que toda la matriz tenga ese valor */
	
	public static void valor(int filas,int columnas, int a) {
		
	  int matriz [][] = new int [filas][columnas];
		
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			matriz [i][j] = a;
			System.out.printf("%3d", matriz[i][j]);
			}
		System.out.println();
		}
	}		
	
	
	
}

	