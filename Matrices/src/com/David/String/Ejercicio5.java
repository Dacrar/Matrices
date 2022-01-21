/**
 * 
 */
package com.David.String;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio5 {

	/**
	 * Programa que reciba como entrada una cadena y un carácter y escriba cuántas veces aparece
	 * ese carácter en la cadena.
	 * No se puede usar indexOf.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();
		
		System.out.println("Introduce el caracter a buscar: ");
		char letra = entrada.nextLine().charAt(0);
		
		int contador = 0;
		
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i)  == letra) {
					contador ++;
				}
				
			}
			if (contador !=0) {
			System.out.printf ("el caracter %c se repite %d veces ", letra,contador);
			} else {
				System.out.println("No se repite ninguna vez");
			}
	}

}
