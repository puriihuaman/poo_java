package Interfaces;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		Cuadrado cuadrado = new Cuadrado(5);

		System.out.println("######### CIRCULO #########");
		circulo.dibujar();
		circulo.calcularArea();
		circulo.rotar();

		System.out.println("\n######### CUADRADO ######### ");
		cuadrado.dibujar();
		cuadrado.calcularArea();
	}
}
