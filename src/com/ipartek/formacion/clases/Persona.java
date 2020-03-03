package com.ipartek.formacion.clases;

public class Persona {
	
	//atributos de una persona
	//siempre son private para que no se pueda manipular desde fuera de esta clase
	// para poder manipular los atributos hay que crear metodos publicos denominados getters y setters. Ha esto se le llama encasulapcion
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private int edad;
	
	//constructor porque se llama igual que la clase
	public Persona() {
		super();
		this.nombre= "Anonimo";
		this.edad= 18;
		
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
