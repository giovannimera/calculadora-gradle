package org.personalsoft;

import static org.junit.Assert.assertEquals;

import org.gradle.PersonaTatiana;
import org.junit.Test;

public class PersonaTatianaTest {

	@Test
    public void testObtenerPersona() {
       assertEquals(PersonaTatiana.obtenerPersona(), null);
    }
}
