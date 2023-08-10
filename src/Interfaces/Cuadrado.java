package Interfaces;

public class Cuadrado implements IFigura, IDibujable {
	private double lado;

	public Cuadrado(double _lado) {
		this.lado = _lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double _lado) {
		this.lado = _lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public void dibujar() {
		System.out.println("!Dibujando un cuadrado¡");
	}
}
