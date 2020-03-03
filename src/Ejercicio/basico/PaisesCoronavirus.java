package Ejercicio.basico;

public class PaisesCoronavirus {

	public static void main(String[] args) {
		final String[] PAISES= {"Noruega","Alemania","Republica Checa","Italia"};
		boolean[]paisesInfectados= {false,true,false,false};
		int[] numeroinfectados= {0,5,0,0};
		int i;
		int Integrate;
		
		
		for (i=0; i<paisesInfectados.length;i++){
		
			if(paisesInfectados[i]==false) {
				System.out.println(PAISES[i]+" no está infectado");
			
			} else {
				System.out.println(PAISES[i]+ "está infectado");
			
			}			
				

		}
		
		for (i=0;i<paisesInfectados.length;i++) {
			if(numeroinfectados[i]>0)
			System.out.println("en " + PAISES[i]+ " hay "+numeroinfectados[i]+" infectados");
		}
		
 
	}
}