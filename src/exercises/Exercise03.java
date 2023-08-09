package exercises;

import javax.swing.*;

public class Exercise03 {
	public static void main(String[] args) {
		float lado1, lado2, perimetro, area;
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Dígite lado 1: "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Dígite lado 2: "));

		Cuadrilatero objCuadrilatero;

		if (lado1 == lado2) {
			objCuadrilatero = new Cuadrilatero(lado1);
			System.out.println("****** Cuadrado ******");
		} else {
			objCuadrilatero = new Cuadrilatero(lado1, lado2);
			System.out.println("****** Rectangulo ******");
		}

		perimetro = objCuadrilatero.getPerimetro();
		area = objCuadrilatero.getArea();

		System.out.printf("Perímetro: %f\n", perimetro);
		System.out.printf("Área: %f\n", area);
	}
}

class Cuadrilatero {
	private float lado1;
	private float lado2;

	public Cuadrilatero(float _lado1, float _lado2) {
		this.lado1 = _lado1;
		this.lado2 = _lado2;
	}

	public Cuadrilatero(float _lado1) {
		this.lado1 = this.lado2 = _lado1;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float _lado1) {
		this.lado1 = _lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float _lado2) {
		this.lado2 = _lado2;
	}

	public float getPerimetro() {
		return 2 * (this.lado1 + this.lado2);
	}

	public float getArea() {
		return this.lado1 * this.lado2;
	}
}

/*
	Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus lados.
	Los valores de la longitud deberán introducirse por línea de ordenes.
	Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.
*/