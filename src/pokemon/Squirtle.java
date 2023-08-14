package pokemon;

public class Squirtle extends Pokemon implements IAgua {
	public Squirtle() {
		super();
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Squirtle y este es mi ataque de placaje.");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Squirtle y este es mi ataque de arañazo.");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy Squirtle y este es mi ataque de mordisco.");
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Soy Squirtle y este es mi ataque de hidrobomba.");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y este es mi ataque de pistola agua.");
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Soy Squirtle y este es mi ataque de burbuja.");
	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Soy Squirtle y este es mi ataque de hidropulso.");
	}
}
