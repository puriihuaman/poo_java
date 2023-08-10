package Interfaces;

public class Circulo implements IFigura, IRotable, IDibujable {
	private double radio;

	public Circulo(double _radio) {
		this.radio = _radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double _radio) {
		this.radio = _radio;
	}

	@Override
	public double calcularArea() {
		final double PI = Math.PI;
		return PI * Math.pow(radio, 2);
	}

	@Override
	public void dibujar() {
		System.out.println("!Dibujando un circulo¡");
	}

	@Override
	public void rotar() {
		System.out.println("!!Estoy rotando¡¡");
	}
}
