package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaniboloTest {

	@Test
	public final void testDanibolo() {
		fail("Not yet implemented"); // TODO
	}
	public void asignarNombre() {
		Danibolo dani = new Danibolo();
		dani.setStNombre("Larry");
        assertEquals("Larry", dani.getStNombre());

	}
	
	public void asignarPrimerApellido() {
		Danibolo dani = new Danibolo();
		dani.setStPrimerApellido("Larry");
        assertEquals("Larry", dani.getStPrimerApellido());

	}

	public void asignarSegundoApellido() {
		Danibolo dani = new Danibolo();
		dani.setStSegundoApellido("Larry");
        assertEquals("Larry", dani.getStSegundoApellido());

	}

	public void asignarNacionalidad() {
		Danibolo dani = new Danibolo();
		dani.setStNacionalidad("Larry");
        assertEquals("Larry", dani.getStNacionalidad());

	}

	public void asignarCorreoElectronico() {
		Danibolo dani = new Danibolo();
		dani.setStCorreoElectronico("dabotero@personalsoft.com.co");
        assertEquals("dabotero@personalsoft.com.co", dani.getStNombre());

	}

	public void asignarEdad() {
		Danibolo dani = new Danibolo();
		dani.setIntEdad(28);
        assertEquals(28l, dani.getIntEdad().longValue());

	}
	
	public void asignarTelefono(){
		Danibolo dani = new Danibolo();
		dani.setIntTelefono(2262899);;
        assertEquals(2262899l, dani.getIntTelefono().longValue());

	}
	
	public void asignarCelular() {
		Danibolo dani = new Danibolo();
		dani.setIntCelular(333222444);;
        assertEquals(333222444, dani.getIntCelular().longValue());

	}


}
