package TestModelo;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Funciones;

public class FuncionesTest {

	private Funciones funciones = new Funciones();
	private int resultado;

	@Test
	public void testCuadrado() {
		resultado = funciones.cuadrado(3);
		assertEquals(9, resultado);
	}


}
