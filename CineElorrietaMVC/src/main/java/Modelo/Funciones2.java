package Modelo;

public class Funciones2 {
	
	private Funciones funciones;
	
	public Funciones2(Funciones funciones) {
		this.funciones = funciones;
	}
	
	public int tripleCuadrado(int x) {
		return 3*funciones.cuadrado(x);
	}
	
	public int dobleCuadrado(int x) {
		return 2*this.funciones.cuadrado(x);
	}
	
}
