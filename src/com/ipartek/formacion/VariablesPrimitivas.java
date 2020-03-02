package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {
		//booleanos
		boolean tienesCoronavirus = true;//valor por defecto
		// enteros
		byte bite=0; //1byte= 8 bits
		short corto=0;//2bytes
		int entero=0;//4 bytes
		long largo=0;//8 bytes
		
		//reales o numeros con coma
		float numeroReal= 2f; //es necesario poner una f al final o por delante
		double todaviaMasGRande=6;//no hace falta castear o poner el tipo
		
		//caracteres
		char letra='a'; //se usan comillas simples
		char letraA= 65;
		
		/**
		 * Wrappers: Son Clases que nos ayudan a trabajar con las varibles primitivas,
		 * estas empiezan siempre con Mayusculas
		 * 
		 * int=>Integer <br>
		 * boolean=> Boolean<br>
		 * char=> Character<br>
		 * ... <br>
		 * ... <br>

		 */

		System.out.println("Un int ocupa"+ Integer.SIZE+ "bits");
		System.out.println("valor minimo+Integer.MIN_VALUE");
		
		String numeroEnFormatoTexto="23";
		int numero2= 2;
		
		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2+ "+"+ "numeroEnFormatoTexto");
	}//main

}//Clase
