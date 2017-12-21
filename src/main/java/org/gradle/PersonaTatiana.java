package org.gradle;

public class PersonaTatiana {
	private String nombres;
	private String telefono;
	private String correo;
	private String direccion;
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public static PersonaTatiana obtenerPersona(){
		PersonaTatiana persona = new PersonaTatiana();
		
		persona.setNombres("Tatiana Hernandez C");
		persona.setCorreo("tahecass02@hotmail.com");
		persona.setDireccion("Medellin Antioquia, Suramericana");
		persona.setTelefono("45621234");
		
		return persona;
		
	}

}
