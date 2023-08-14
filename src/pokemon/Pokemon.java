package pokemon;

public abstract class Pokemon {
	protected int numPokedex;
	protected String nombrePokemon;
	protected double pesoPokemon;
	protected String sexo;
	protected String temporadaQueAparece;
	protected String tipo;

	public Pokemon() {
	}

	public abstract void atacarPlacaje();

	public abstract void atacarAraniazo();

	public abstract void atacarMordisco();
}
