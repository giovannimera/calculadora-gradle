package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class WuendyPersonTest {

	@Test
	public void testGetNombres() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setNombres("Pedro");
		assertEquals("Pedro", wuendyPerson.getNombres());
	}

	@Test
	public void testSetNombres() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setNombres("Pedro");
		assertFalse(wuendyPerson.getNombres()==null);
	}

	@Test
	public void testGetApellidos() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setApellidos("Perez");
		assertEquals("Perez", wuendyPerson.getApellidos());
	}

	@Test
	public void testSetApellidos() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setApellidos("Perez");
		assertFalse(wuendyPerson.getApellidos()==null);
	}

	@Test
	public void testGetEdad() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setEdad(10);
		assertEquals(10, wuendyPerson.getEdad());
	}

	@Test
	public void testSetEdad() {
		WuendyPerson wuendyPerson=new WuendyPerson();
		wuendyPerson.setEdad(10);
		assertFalse(wuendyPerson.getEdad()==0); 
	}

}
