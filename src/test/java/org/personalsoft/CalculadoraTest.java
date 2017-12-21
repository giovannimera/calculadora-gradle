package org.personalsoft;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.gradle.CalculadoraDomain;
import org.gradle.PersonaGabriel;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
    public void testSuma() {
        assertEquals(4, 2 + 2);
    }
	
	@Test
    public void testResta() {
        assertEquals(1, 3 - 2);
    }
	
	@Test
	public void testCrearPersonaGabriel(){
		/*CalculadoraDomain main = new CalculadoraDomain();
		@SuppressWarnings("unchecked")
		ArrayList<PersonaGabriel> listaPrueba = (ArrayList<PersonaGabriel>) main.crearPersonas();
		assertEquals(2, listaPrueba.size());*/
		
	}
}
