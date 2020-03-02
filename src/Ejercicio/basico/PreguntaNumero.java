package Ejercicio.basico;

import java.util.Scanner;

public class PreguntaNumero {

	public static void main(String[] args) {
		System.out.println("dime un mumero");
		
		Scanner teclado= new Scanner (System.in);
		
		int numero = teclado.nextInt();// lee un numero introducido por el usuario
		System.out.println("has escrito" + numero);
		
		// teclado.close(); cerramos el teclado

	}

}
