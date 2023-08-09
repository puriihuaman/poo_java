package Abstract;

public class Main {
	public static void main(String[] args) {
		Carnivoro leon = new Carnivoro();
		Herbivoro conejo = new Herbivoro();
		Planta tulipan = new Planta();

		leon.alimentarse();
		conejo.alimentarse();
		tulipan.alimentarse();

	}
}
