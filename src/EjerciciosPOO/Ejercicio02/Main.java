package EjerciciosPOO.Ejercicio02;


import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		int posY, posX;
		posX = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición en X del objeto: "));
		posY = Integer.parseInt(JOptionPane.showInputDialog("Digite la posición en Y del objeto: "));

		Board obj1 = new Board(posX, posY);

		System.out.printf("Objeto en la posición X: %d\n", obj1.getX());
		System.out.printf("Objeto en la posición Y: %d\n", obj1.getY());

		posX = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a mover en X derecha para objeto: "));
		posY = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a mover en Y arriba para objeto: "));

		obj1.moveRight(posX);
		obj1.moveUp(posY);

		System.out.printf("Objeto en la posición X: %d\n", obj1.getX());
		System.out.printf("Objeto en la posición Y: %d\n", obj1.getY());

		posX = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a mover en X izquierda para objeto: "));
		posY = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a mover en Y abajo para objeto: "));

		obj1.moveLeft(posX);
		obj1.moveDown(posY);

		System.out.printf("Objeto en la posición X: %d\n", obj1.getX());
		System.out.printf("Objeto en la posición Y: %d\n", obj1.getY());
	}
}

/*
	Construir un programa que permita dirigir el movimiento de un objeto dentro de tablero y actualice su
posición dentro del mismo.
	Los movimiento posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
	Tras cada movimiento el programa mostrará la nueva dirección elegida y las cordenadas de
situación del objeto dentro del tablero.
*/