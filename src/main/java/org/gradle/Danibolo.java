package org.gradle;

import java.util.Date;

public class Danibolo {

	String  stNombre;
	String  stPrimerApellido;
	String  stSegundoApellido;
	Date    dtFechaNacimiento;
	String  stNacionalidad;
	Integer intEdad;
	Integer intTelefono;
	Integer intCelular;
	String  stCorreoElectronico;

	public Danibolo(String stNombre, String stPrimerApellido,
			String stSegundoApellido, Date dtFechaNacimiento,
			String stNacionalidad, Integer intEdad, Integer intTelefono,
			Integer intCelular, String stCorreoElectronico) {

		this.stNombre = stNombre;
		this.stPrimerApellido = stPrimerApellido;
		this.stSegundoApellido = stSegundoApellido;
		this.dtFechaNacimiento = dtFechaNacimiento;
		this.stNacionalidad = stNacionalidad;
		this.intEdad = intEdad;
		this.intTelefono = intTelefono;
		this.intCelular = intCelular;
		this.stCorreoElectronico = stCorreoElectronico;
	}

	public String getStNombre() {
		return stNombre;
	}

	public void setStNombre(String stNombre) {
		this.stNombre = stNombre;
	}

	public String getStPrimerApellido() {
		return stPrimerApellido;
	}

	public void setStPrimerApellido(String stPrimerApellido) {
		this.stPrimerApellido = stPrimerApellido;
	}

	public String getStSegundoApellido() {
		return stSegundoApellido;
	}

	public void setStSegundoApellido(String stSegundoApellido) {
		this.stSegundoApellido = stSegundoApellido;
	}

	public Date getDtFechaNacimiento() {
		return dtFechaNacimiento;
	}

	public void setDtFechaNacimiento(Date dtFechaNacimiento) {
		this.dtFechaNacimiento = dtFechaNacimiento;
	}

	public String getStNacionalidad() {
		return stNacionalidad;
	}

	public void setStNacionalidad(String stNacionalidad) {
		this.stNacionalidad = stNacionalidad;
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public Integer getIntTelefono() {
		return intTelefono;
	}

	public void setIntTelefono(Integer intTelefono) {
		this.intTelefono = intTelefono;
	}

	public Integer getIntCelular() {
		return intCelular;
	}

	public void setIntCelular(Integer intCelular) {
		this.intCelular = intCelular;
	}

	public String getStCorreoElectronico() {
		return stCorreoElectronico;
	}

	public void setStCorreoElectronico(String stCorreoElectronico) {
		this.stCorreoElectronico = stCorreoElectronico;
	}
	
}
