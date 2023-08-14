package pokemon;

public class Pikachu extends Pokemon implements IElectrico {
	public Pikachu() {
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Pikachu y este es mi ataque de placaje.");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Pikachu y este es mi ataque de arañazo.");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy Pikachu y este es mi ataque de mordisco.");
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Soy Pikachu y este es mi ataque de impactrueno.");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy Pikachu y este es mi ataque de puño trueno.");
	}

	@Override
	public void atacarRayo() {
		System.out.println("Soy Pikachu y este es mi ataque de rayo.");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Soy Pikachu y este es mi ataque de rayo carga.");
	}
}
