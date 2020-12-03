package TestModelo;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Funciones;
import Modelo.Funciones2;

public class Funciones2Test {

	Funciones funcionesMock = mock(Funciones.class);
	 
	private Funciones2 funciones2 = new Funciones2(funcionesMock);
	private int resultado;
	
	@Test
	public void test() {
		when(funcionesMock.cuadrado(anyInt())).thenReturn(18);	
		resultado = funciones2.tripleCuadrado(3);
		assertEquals(27, resultado);
	}

}
