package EjerciciosPOO.Ejercicio03;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		String brand, model;
		double price;
		int amount, count = 0;

		amount = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vehiculos a crear: "));
		Vehicle[] vehicles = new Vehicle[amount];
		Vehicle vehicle;

		do {
			brand = JOptionPane.showInputDialog(String.format("Digite la marca del auto N°%d: ", (count + 1)));
			model = JOptionPane.showInputDialog(String.format("Digite el modelo del auto N°%d: ", (count + 1)));
			price = Float.parseFloat(JOptionPane.showInputDialog(String.format("Digite el precio del auto N°%d: ", (count + 1))));

			vehicle = new Vehicle(brand, model, price);
			vehicles[count] = vehicle;
			count++;
		} while (count < amount);

		int index = cheapCarIndex(vehicles);
		String text = vehicles[index].showData();
		System.out.println(text);
	}

	public static int cheapCarIndex(Vehicle vehicles[]) {
		double price;
		int index = 0;
		price = vehicles[0].getPrice();

		for (int i = 1; i < vehicles.length; i++) {
			if (vehicles[i].getPrice() < price) {
				price = vehicles[i].getPrice();
				index = i;
			}
		}
		return index;
	}
}

/*
	Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio, imprima las
propiedades del vehículo más barato. Para ello, se deberian leer por teclado las características de cada vehículo y
crear una clase que represente a cada uno de ellos.
*/