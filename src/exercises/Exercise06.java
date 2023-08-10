package exercises;

public class Exercise06 {
	public static void main(String[] args) {
		Gato tom = new Gato();
		Perro tarzan = new Perro();
		Canario cana = new Canario();
		Pinguino pingui = new Pinguino();
		Lagarto cocodrilo = new Lagarto();

		tom.caminar();
		tom.comer();

		tarzan.comer();
		tarzan.caminar();

		cana.comer();
		cana.caminar();

		pingui.caminar();
		pingui.comer();

		cocodrilo.caminar();
		cocodrilo.comer();
	}
}

abstract class Animal {
	public Animal() {
	}

	protected abstract void comer();

	protected abstract void caminar();
}

abstract class Mamifero extends Animal {
}

abstract class Ave extends Animal {
}

class Gato extends Mamifero {
	public Gato() {
	}

	@Override
	protected void comer() {
		System.out.println("Soy un gato y como en el piso en un plato.");
	}

	@Override
	protected void caminar() {
		System.out.println("Soy un gato camino en 4 patas.");
	}
}

class Perro extends Mamifero {
	public Perro() {
	}

	@Override
	protected void comer() {
		System.out.println("Soy un perro y como en el piso en un plato.");
	}

	@Override
	protected void caminar() {
		System.out.println("Soy un perro camino en 4 patas.");
	}
}

class Pinguino extends Ave {
	public Pinguino() {
	}

	@Override
	protected void comer() {
		System.out.println("Soy un pinguino y como pescado en el mar.");
	}

	@Override
	protected void caminar() {
		System.out.println("Soy un pinguino camino en 2 patas y nado.");
	}
}

class Canario extends Ave {
	public Canario() {
	}

	@Override
	protected void comer() {
		System.out.println("Soy un canario y como en el campo.");
	}

	@Override
	protected void caminar() {
		System.out.println("Soy un canario camino en 2 patas y vuelo.");
	}
}

class Lagarto extends Animal {
	public Lagarto() {
	}

	@Override
	protected void comer() {
		System.out.println("Soy un lagarto y como en el campo.");
	}

	@Override
	protected void caminar() {
		System.out.println("Soy un lagarto y ando arrastrandome en el piso.");
	}
}