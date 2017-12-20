package org.gradle;

public class CalculadoraDomain {

	public int sumar(int a, int b){
		return a + b;
	}
	
	public int restar(int a, int b){
		return a - b;
	}
	

	public int multiplicar(int a, int b){
		int valor =a * b;
		return valor;
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
	
	public void mySuperMethodThatDoesNotDoNothing(String superParameter){
		
		if("A".equals(superParameter)){
			System.out.println("The value is A");
		} else {
			System.out.println("The value is: B");
		}
		
		
	}

	
}
