package Abstract;

public class Cuadrado extends Figura {
	private double lado1;
	private double lado2;

	public Cuadrado(double _lado) {
		this.lado1 = this.lado2 = _lado;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double _lado1) {
		this.lado1 = _lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double _lado2) {
		this.lado2 = _lado2;
	}

	@Override
	protected double calcularArea() {
		return (this.lado1 * this.lado2);
	}
}
