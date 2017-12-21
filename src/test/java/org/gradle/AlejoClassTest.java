package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlejoClassTest {
	
	@Test
	public void sayMyNameTest() {
		AlejoClass ac = new AlejoClass();
		
		assertEquals("me llamo Alejo",ac.sayMyName("Alejo"));
	}
	
	@Test
	public void calculateBorn() {
		AlejoClass ac = new AlejoClass();
		assertTrue(ac.calculateBorn(1,2)==1);
//		assertEquals(1, ac.calculateBorn(1,2));
	}

}
