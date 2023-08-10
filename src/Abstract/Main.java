package Abstract;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Carnivoro leon = new Carnivoro();
		Herbivoro conejo = new Herbivoro();
		Planta tulipan = new Planta();

		leon.alimentarse();
		conejo.alimentarse();
		tulipan.alimentarse();

		// Implementando la clase circulo y cuadrado
		double lado, radio;
		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado del cuadrado: "));
		radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo: "));

		Cuadrado cuadrado = new Cuadrado(lado);
		Circulo circulo = new Circulo(radio);

		System.out.printf("\nÁrea del circulo: %f\n", circulo.calcularArea());
		System.out.printf("Área del cuadrado: %f\n", cuadrado.calcularArea());
	}
}
