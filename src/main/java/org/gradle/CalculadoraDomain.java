package org.gradle;

public class CalculadoraDomain {

	public int sumar(int a, int b){
		return a + b;
	}
	
	public int restar(int a, int b){
		return a - b;
	}
	
	public int dividir(int a, int b){
		try{
			int c = a / b;
			return c;
		} catch(Exception e){
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
}
