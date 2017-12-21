package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaniboloTest {

	Danibolo dani = new Danibolo();

	@Test
	public final void testDanibolo() {
		fail("Not yet implemented"); // TODO
	}
	public void asignarNombre() {

		dani.setStNombre("Larry");
		assertEquals("Larry", dani.getStNombre());

	}

	public void asignarPrimerApellido() {

		dani.setStPrimerApellido("Larry");
		assertEquals("Larry", dani.getStPrimerApellido());

	}

	public void asignarSegundoApellido() {

		dani.setStSegundoApellido("Larry");
		assertEquals("Larry", dani.getStSegundoApellido());
	}

	public void asignarNacionalidad() {
		dani.setStNacionalidad("Larry");
		assertEquals("Larry", dani.getStNacionalidad());
	}

	public void asignarCorreoElectronico() {

		dani.setStCorreoElectronico("dabotero@personalsoft.com.co");
		assertEquals("dabotero@personalsoft.com.co", dani.getStNombre());

	}

	public void asignarEdad() {
		dani.setIntEdad(28);
		assertEquals(28l, dani.getIntEdad().longValue());

	}

	public void asignarTelefono(){
		dani.setIntTelefono(2262899);;
		assertEquals(2262899l, dani.getIntTelefono().longValue());

	}

	public void asignarCelular() {
		dani.setIntCelular(333222444);;
		assertEquals(333222444, dani.getIntCelular().longValue());

	}


}
