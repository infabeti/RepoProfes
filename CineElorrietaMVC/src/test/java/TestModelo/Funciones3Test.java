package TestModelo;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Funciones;
import Modelo.Funciones2;
import Modelo.Funciones3;

public class Funciones3Test {

	private Funciones funciones1Mock = mock(Funciones.class);
	private Funciones2 funciones2Mock = mock(Funciones2.class);
	
	private Funciones3 funciones3 
			= new Funciones3(funciones1Mock, funciones2Mock);
	@Test
	public void test() {
		when(funciones1Mock.cuadrado(anyInt())).thenReturn(5);
		when(funciones2Mock.dobleCuadrado(anyInt()))
			.thenReturn(7);
		when(funciones2Mock.tripleCuadrado(anyInt()))
			.thenReturn(7);
		
		funciones3.DoSomething();
		verify(funciones1Mock, times(1))
			.cuadrado(4);
		verify(funciones2Mock, times(1))
			.dobleCuadrado(5);
		verify(funciones2Mock, times(1))
			.tripleCuadrado(6);
	}

}
