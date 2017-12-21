package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaSonarGitTest {

	
	@Test
	public void imprimir(){
		PruebaSonarGit pruebaSonarGit = new PruebaSonarGit("Red");
		 assertEquals("Red", pruebaSonarGit.getColor());
	}
}
