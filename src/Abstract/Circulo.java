package Abstract;

public class Circulo extends Figura {
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
	protected double calcularArea() {
		final double PI = Math.PI;
		return PI * Math.pow(this.radio, 2);
	}
}
