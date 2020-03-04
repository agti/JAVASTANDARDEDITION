package Ejercicio.basico;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 14;
		System.out.println(a+(a%2==0?"es par":"es impar"));

		int b = -1;
		System.out.println(b+(b>=0?" es positivo":" es negativo"));
		
		
		
		/*
		si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5,
		si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
		Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
		*/
		
		int c = 55;
		System.out.println(c+(c>=0?"es positivo":"es negativo"));
		System.out.println(c+(c%10==0?"es multiplo de 10":"no es multiplo de 10"));
		System.out.println(c+(c>100?"es mayor que 100":"es menor que 100"));
		
		int aa = 2020;
	    int an = 1999;
	    int ma = 03;
	    int mm = 10;
	    int da = 03;
	    int dn = 17;
		
		
	}
	
	
	
	

}
