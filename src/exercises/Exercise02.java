package exercises;

/*
	Hacer un programa que dado el capital, la tasa y el número de periodos, calcule el interes correspondiente.
*/
public class Exercise02 {
	public static void main(String[] args) {
		double capital = 1000, tasa = 4, monto;
		int periodo = 10;
		double interes;

		monto = capital * Math.pow((1 + tasa / 100), periodo);
		interes = monto - capital;

		System.out.printf("Interes total: %f\n", interes);
	}
}
