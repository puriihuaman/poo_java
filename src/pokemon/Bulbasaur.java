package pokemon;

public class Bulbasaur extends Pokemon implements IPlanta {
	public Bulbasaur() {
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Bulbasaur y este es mi ataque placaje.");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Bulbasaur y este es mi ataque arañazo.");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy Bulbasaur y este es mi ataque de mordisco.");
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Soy Bulbasaur y este es mi ataque de paralizar.");
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Soy Bulbasaur y este es mi ataque de drenaje.");
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Soy Bulbasaur y este es mi ataque de hoja afilada.");
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Soy Bulbasaur y este es mi ataque de latigo cepa.");
	}
}
