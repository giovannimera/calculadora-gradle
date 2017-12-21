package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonSernaTest {

	@Test
	public void nombreCompleto(){
		PersonSerna personSerna = new PersonSerna("Nombre 1", 
				"apellido 1", 19);
		assertEquals("Nombre 1apellido 1", personSerna.obtenerNombreCompleto(personSerna.getNombre(), 
				personSerna.getApellido()));
	}
}
