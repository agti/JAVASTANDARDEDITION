package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("Prueba tecnica");
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println("El numero 0 no es par ni impar");

			} // if
			else {if(i % 2 == 0) {
				System.out.println("El numero" + i + "es par");
				
			}else {
				System.out.println("el numero" + i + "es impar");
			}}
			
			
			

			/*
			if (i % 2 == 0) {
				System.out.println("El numero " + i + "es par");
			} else {
				System.out.println("el numero" + i + "es impar");

			} // if
			*/

		} // for

	}// main

}// clase
