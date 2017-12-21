package org.personalsoft;

import static org.junit.Assert.assertEquals;

import org.gradle.Anderson;
import org.junit.Test;

public class AndersonTest {

	@Test
	public void suma(){
		Anderson anderson = new Anderson();		
		int suma = anderson.sumar(1, 2);
		assertEquals(3, suma);
	}
	
}
