package logic;

import javax.swing.*;

public class Operation {
	int suma;
	int resta;
	int multi;
	int division;

	public void sumar(int a, int b) {
		suma = a + b;
	}

	public void restar(int a, int b) {
		resta = a - b;
	}

	public void multiplicar(int a, int b) {
		multi = a * b;
	}

	public void dividir(int a, int b) {
		division = a / b;
	}

	@Override
	public String toString() {
		return String.format("Operation{ suma: %d, resta: %d, multi: %d, division: %d }",
			suma,
			resta,
			multi,
			division);
	}

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

		Operation op = new Operation();

		op.sumar(n1, n2);
		op.restar(n1, n2);
		op.multiplicar(n1, n2);
		op.dividir(n1, n2);

		System.out.println(op.toString());
	}
}
