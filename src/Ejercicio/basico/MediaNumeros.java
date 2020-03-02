package Ejercicio.basico;

import java.util.Scanner;

/**
 * ejercicio para pedir 3 numeros por pantalla y sacar la media
 */
public class MediaNumeros {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc= new Scanner(System.in);
		float media;
		System.out.println("Dime el primer numero");
		num1= Integer.parseInt(sc.nextLine());
		
        System.out.println("Dime el segundo numero");
        num2= Integer.parseInt(sc.nextLine());
        
        System.out.println("Dime el tercer numero");
        num3= Integer.parseInt(sc.nextLine());
        
        media = (num1+num2+num3)/ (float)3.0;
        System.out.println("la media es"+media);
        
	}

}
