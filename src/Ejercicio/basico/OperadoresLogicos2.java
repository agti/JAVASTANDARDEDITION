package Ejercicio.basico;

public class OperadoresLogicos2 {

	public static void main(String[] args) {
		boolean w = false;
		boolean x = true;
		boolean y = true;
		boolean z = false;
		
		System.out.println( w || y && x && z || z  );
		System.out.println( x && !y && !y || !w && y);

	}

}
