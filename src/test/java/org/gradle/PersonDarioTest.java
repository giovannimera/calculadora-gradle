package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonDarioTest {

	@Test
	public void compararNombres() {
		PersonDario person = new PersonDario("1", "Larry", "holthon", "310203040");
		assertEquals("Larry", person.getName());
	}

	@Test
	public void buscarById() {
		/*PersonDario person = new PersonDario("1", "Larry", "holthon", "310203040");
		assertEquals("1", person.getName());*/
	}
}
