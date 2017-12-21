package org.gradle;
import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaJuanTest {
	
	PersonaJuan persona = new PersonaJuan("Juan", "Carlos", "juhurtado@personalsoft.com.co", 22, "123456789");
	
	@Test
	public void informacionPersona(){
		
		assertEquals("Juan Carlos", (persona.getNombre() + " " + persona.getApellidos()));
	}

}
