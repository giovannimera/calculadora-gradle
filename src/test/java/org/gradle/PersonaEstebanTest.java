package org.gradle;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonaEstebanTest {
	
	PersonaEsteban pru = new PersonaEsteban();
	
	@Test
	public void Setnombre(){
		
		pru.Setnombre("esteban");
		assertEquals("esteban", pru.GetNombre());
	 }
	
	@Test
	public void Setapellido(){
	   pru.Setapellido("Acosta");  
	   assertEquals("Acosta", pru.GetApellido());	
	 }
	
	 @Test
	 public void Settel(){
		 pru.Settel("2692021");
		 assertEquals("2692021", pru.GetTel());	
	 }
	 


	


}
