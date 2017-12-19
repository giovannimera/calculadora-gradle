package org.personalsoft;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
    public void testSuma() {
        assertEquals(4, 2 + 2);
    }
	
	@Test
    public void testResta() {
        assertEquals(1, 3 - 2);
    }
}
