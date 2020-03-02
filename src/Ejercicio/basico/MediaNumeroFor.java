package Ejercicio.basico;

import java.util.Scanner;

/** pedir al usuario la temperatura de los dias de la semana, comenzando por el lunes<br>
mostrar por pantalla la media de la semanna, y la temperatura mas alta y mas baja
 *
 */

public class MediaNumeroFor {

	public static void main(String[] args) {
		
		String[] diasSemana= {"lunes","martes","miercoles", "jueves", "viernes","sabado", "domingo"};
		int cont=0;
		int suma=0;	
		int temp= 0;
		int tempMax=0;
		int tempMin=0;
		float media= 0;
		Scanner sc= new Scanner(System.in);
		for (cont =0; cont<7;cont++) {
			System.out.println("¿qué temperatura hizo el"+diasSemana[cont]+"?");
			temp= Integer.parseInt(sc.nextLine());
			suma+=temp;
			
			if (cont==0){
				tempMax=temp;
				tempMin=temp;
	
			}else {
				if (temp>tempMax) {
					tempMax=temp;
				}
				if (temp<tempMin) {
					tempMin=temp;
				}
			}
		}
		
	    media= (float)suma / 7;
	    System.out.println("la temperatura media ha sido"+media);
	    System.out.println("la temperatura minima ha sido"+tempMin);
	    System.out.println("la temperatura maxima ha sido"+tempMax);
	

	}

}
