/**
 * 
 */
package com.David.String;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Ejercicio6 {

	/**
	 * 6. Repite el ejercicio anterior pero esta vez usando indexOf.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();
		
		System.out.println("introduce letra");
		char letra = entrada.nextLine().charAt(0);
		
		int posicion,contador = 0;
		
		posicion = cadena.indexOf(letra);
		
		while (posicion != -1) {
			contador ++;
		posicion = cadena.indexOf(letra,posicion+1);
		
		}
	if (contador==0)
			System.out.println("no se repite la letra "+ letra);
		else
		System.out.println("En el texto se repite "+ contador + " veces la letra "+ letra);
		
		
		
	}
	
}
