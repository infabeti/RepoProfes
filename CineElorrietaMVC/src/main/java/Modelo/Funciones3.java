package Modelo;

public class Funciones3 {
	private Funciones funciones;
	private Funciones2 funciones2;
	
	public Funciones3(Funciones funciones
			, Funciones2 funciones2) {
		this.funciones = funciones;
		this.funciones2 = funciones2;
	}
	
	public void DoSomething() {
		int res = this.funciones.cuadrado(4);
		int res2 = this.funciones2.dobleCuadrado(5);
		int res3 = this.funciones2.tripleCuadrado(6);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
	}
}
