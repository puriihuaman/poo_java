package exercises;

import javax.swing.JOptionPane;

/*
	Hacer un programa que determine la suma de N primeros números enteros.
*/
public class Exercise01 {
	public static void main(String[] args) {
		int total = 0, number;
		number = Integer.parseInt(JOptionPane.showInputDialog("Dígite un número: "));

		/*for (int i = 1; i <= number; i++) {
			total += i;
		}*/
		total = number * (number + 1) / 2;

		System.out.printf("La suma de los %d primeros número es: %s.\n", number, total);
	}
}
