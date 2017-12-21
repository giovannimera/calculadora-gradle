package org.gradle;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraDomain {

	private static final Logger log = Logger.getLogger(CalculadoraDomain.class.getName());

	public CalculadoraDomain(){
		ArrayList<PersonaGabriel> lista = crearPersonas();

	}
	
	public ArrayList<PersonaGabriel> crearPersonas(){
		ArrayList<PersonaGabriel> lista = new ArrayList<PersonaGabriel>();
		PersonaGabriel gabriel = new PersonaGabriel();
		gabriel.setNombre("Gabriel");
		gabriel.setEdad(26);
		gabriel.setProfesion("Ingeniero");
		
		lista.add(gabriel);
		
		PersonaGabriel daniela = new PersonaGabriel();
		gabriel.setNombre("Daniela");
		gabriel.setEdad(23);
		gabriel.setProfesion("Administradora");
		
		lista.add(daniela);
		return lista;
	}
	
	
	
	public int sumar(int a, int b){
		return a + b;
	}

	public int restar(int a, int b){
		return a - b;
	}

	
	public int calcularArea(int a, int b){
		
		return a * b;
	}
	


	public int multiplicar(int a, int b){
		return a * b;
	}

	public int dividir(int a, int b){
		try{
			return a / b;
		} catch(Exception e){
			log.log(Level.WARNING, "error metodo dividir", e);
			return -1;
		}
	}

	public void mySuperMethodThatDoesNotDoNothing(String superParameter){

		if("A".equals(superParameter)){
			log.log(Level.WARNING, "el valor de a");
		} else {
			log.log(Level.WARNING, "el valor de b");
		}
	}

}
