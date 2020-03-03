package com.ipartek.formacion.clases;

public class PaisesPruebas {

	public static void main(String[] args) {
		//crear dos objetos de tipo pais
		//España con 27 casos
		//Francia con 300 casos
		Pais p1= new Pais();
		p1.setNombre("egpaña");
		p1.setInfectados(300);
		
		Pais p2= new Pais();
		p2.setNombre("francia");
		p2.setInfectados(300);
		
		System.out.println(p1);
	}
}
