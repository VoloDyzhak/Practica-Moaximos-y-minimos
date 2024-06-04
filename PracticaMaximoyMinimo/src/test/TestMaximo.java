package test;
import Clases.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMaximo {
	Maximo max = new Maximo();



	
	@Test
	void testCero(){
		max.Maximode2(0,3);
	}

	@Test
	void testMayot1(){
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()-> max.Maximode2( 1,3));
		int esperado = 3;
		String obtenido = excepcion.getLocalizedMessage();
		assertEquals(esperado, obtenido);
	}
	@Test
	void testMayor2(){
	
		 Exception excepcion = assertThrows(IllegalArgumentException.class,
					()-> max.Maximode2( 7,3));
		int esperado = 7;
		String obtenido =excepcion.getLocalizedMessage();
		assertEquals(esperado, obtenido);
	}
	
	
	
	
}
