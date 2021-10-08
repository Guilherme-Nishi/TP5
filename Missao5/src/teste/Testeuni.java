package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import lojaRoupas.*;
class Testeuni {
	Validador v=new Validador();

	@Test
	void testValidaEmail() {
		assertEquals(true,v.validaEmail("guilherme@hotmail.com"));
	}

	@Test
	void testValidaNome() {
		assertTrue(v.validaNome("Guilherme"));
		assertFalse(v.validaNome("1uilherme"));
		assertFalse(v.validaNome(""));
	}

	@Test
	void testValidaPreco() {
		assertEquals(false,v.validaPreco(0.00));
		
		
	}

}
