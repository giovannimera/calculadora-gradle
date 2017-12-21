package org.personalsoft;

import static org.junit.Assert.assertEquals;

import org.gradle.PersonaTatiana;
import org.junit.Test;

public class PersonaTatianaTest {

	@Test
    public void testObtenerPersona() {
	PersonaTatiana persona = new PersonaTatiana();
		
		persona.setNombres("Tatiana Hernandez C");
		persona.setCorreo("tahecass02@hotmail.com");
		persona.setDireccion("Medellin Antioquia, Suramericana");
		persona.setTelefono("45621234");
		
       assertEquals( persona, PersonaTatiana.obtenerPersona());
    }
}
