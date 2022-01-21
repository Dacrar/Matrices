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
	
	public static void valor(int matriz[][], int a) {
		
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			matriz [i][j] = a;
			}
		}
	}		
	
	public static boolean valor0(int m[][] ) {
		 boolean comprobar = true;
		 
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					
						if(m[i][j]!=0) {
							comprobar= false;
						
					 
					 }	
				
				}
				
			}
			
			return comprobar;
			
		}	

			
	public static int contador(int matriz[][], int a) {
		int sumar=0;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					if (matriz[i][j]== a) {
						sumar++;
			
				}
					
			}	
		}
		return sumar;
			
	}
		
	public static boolean trianguloSuperior (int matriz[][]) {
		
		boolean triangulo = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j<i && matriz[i][j]!=0)
					triangulo = false;
				else 
					continue;		
			}		
		}
			return triangulo;	
	
	}

	
	public static boolean trianguloInferior (int matriz[][]) {
		
		boolean triangulo = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i<j && matriz[i][j]!=0)
					triangulo = false;
				else 
					continue;		
			}		
		}
			return triangulo;	
	
	}
	
	
	public static int mayorvalor(int matriz[][]) {
		int mayor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			  if(matriz[i][j] > mayor) {
	                mayor = matriz[i][j];
			}
		}
	}	
		return mayor;
	}
	
	public static int menorvalor(int matriz[][]) {
		int menor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			  if(matriz[i][j] < menor) {
	               menor = matriz[i][j];
			}
		}
	}	
		return menor;
	}
	
	public static int matrizdeterminante(int matriz[][]) {
		int determinante;
		
		determinante = ((matriz[0][0]*matriz[1][1]*matriz[2][2])+
						(matriz[1][0]*matriz[2][1]*matriz[0][2])+
						(matriz[0][1]*matriz[1][2]*matriz[2][0])-
						(matriz[0][2]*matriz[1][1]*matriz[2][0])-
						(matriz[2][1]*matriz[1][2]*matriz[0][0])-
						(matriz[1][0]*matriz[0][1]*matriz[2][2]));
						
						
		return determinante;
	}
		
	public static int[][] matriztraspuesta(int matriz[][]) {
		
		int traspuesta [][] = new int[matriz[0].length][matriz.length];
		
		for (int i = 0; i < traspuesta[0].length; i++) {
			for (int j = 0; j < traspuesta.length; j++) {
				traspuesta[j][i]= matriz[i][j];
				
			}
		
		}
		return traspuesta;  
	}
	
	
	public static String letradni(int dni) {
		final String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E","N"};
		
		int resto = dni %23;
		return String.valueOf(dni)+"-"+ letras[resto];
		
			}
			
		
		
		
		

	
	
	}