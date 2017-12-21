package org.gradle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraDomain {

	private static final Logger log = Logger.getLogger(CalculadoraDomain.class.getName());

	public int sumar(int a, int b){
		return a + b;
	}

	public int restar(int a, int b){
		return a - b;
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
