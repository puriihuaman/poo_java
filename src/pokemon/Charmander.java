package pokemon;

public class Charmander extends Pokemon implements IFuego {
	public Charmander() {
		super();
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Charmander y este es mi ataque placaje.");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Charmander y este es mi ataque arañazo.");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy Charmander y este es mi ataque mordisco.");
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Soy Charmander y este es mi ataque puño fuego.");
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y este es mi ataque ascuas.");
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Soy Charmander y este es mi ataque lanza llamas.");
	}
}
