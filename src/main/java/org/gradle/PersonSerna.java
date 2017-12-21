package org.gradle;

public class PersonSerna {

	private String nombre;
	private String apellido;
	private int edad;
		
	public PersonSerna() {
	}

	public PersonSerna(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto(String nombre, String apellido){
		return nombre.concat(apellido);
	}
}
