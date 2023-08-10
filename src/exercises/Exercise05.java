package exercises;

import javax.swing.*;

public class Exercise05 {
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		Coche coche = new Coche();

		int opcion;
		do {
			System.out.println("VEHÍCULOS");
			System.out.println("=========");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción (1-8): "));
			String distancia;

			switch (opcion) {
				case 1 -> {
					distancia = JOptionPane.showInputDialog("Introduce la distancia a recorrer: ");
					int distanciaBicicleta = Integer.parseInt(distancia);
					bici.andar(distanciaBicicleta);
				}
				case 2 -> bici.hacerCaballito();
				case 3 -> {
					distancia = JOptionPane.showInputDialog("Introduce la distancia a recorrer: ");
					int distanciaCoche = Integer.parseInt(distancia);
					coche.andar(distanciaCoche);
				}
				case 4 -> coche.quemarRueda();
				case 5 -> System.out.printf("Kilometraje de la bicicleta: %d km\n", bici.getKmRecorrido());
				case 6 -> System.out.printf("Kilometraje del coche: %d km\n", coche.getKmRecorrido());
				case 7 -> System.out.printf("Kilometraje total: %d km\n", Vehiculo.kmTotales);
				case 8 -> System.out.println("Saliendo del programa...");
				default -> System.out.println("Opción inválida. Introduce un número del 1 al 8.");
			}

		} while (opcion != 8);
	}
}

class Vehiculo {
	protected int vehiculosCreados = 0;
	protected static int kmTotales = 0;
	protected int kmRecorrido;

	public Vehiculo() {
		vehiculosCreados++;
	}

	public void andar(int _distancia) {
		kmRecorrido += _distancia;
		kmTotales += _distancia;
	}

	public int getKmRecorrido() {
		return kmRecorrido;
	}
}

class Bicicleta extends Vehiculo {
	public void hacerCaballito() {
		System.out.println("Haciendo caballito con la bici");
	}
}

class Coche extends Vehiculo {
	public void quemarRueda() {
		System.out.println("Quemando rueda del coche");
	}
}