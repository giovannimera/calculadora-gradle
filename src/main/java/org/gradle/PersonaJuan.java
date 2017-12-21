package org.gradle;

public class PersonaJuan {
	
	private final String nombre;
	private final String apellidos;
	private final String correo;
	private final int edad;
	private final String telefono;
	
	public PersonaJuan(String nombre, String apellidos, String correo, int edad, String telefono) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.edad = edad;
		this.telefono = telefono;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public int getEdad() {
		return edad;
	}

	public String getTelefono() {
		return telefono;
	}
	
}
