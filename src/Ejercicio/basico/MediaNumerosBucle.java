package Ejercicio.basico;

import java.util.Scanner;

public class MediaNumerosBucle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean terminar=true;
		float numero, total=0;
		float contador= 0;
		do {
			System.out.println("Dime un mumero");
			numero = Float.parseFloat(sc.nextLine());
			total= total+numero;
		//preguntar si quiere terminar o "si" o "SI" o "Si" o "sI";
			String linea = sc.nextLine();
			if(linea.equalsIgnoreCase("si")) {
				terminar=false;
			}
			contador++;
			
		} while (terminar);
		
		System.out.println("El total es " +total);
		System.out.println("La media es X");

	}

}
