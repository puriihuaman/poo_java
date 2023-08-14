package pokemon;

public class Main {
	public static void main(String[] args) {
		Charmander charmander = new Charmander();
		Pikachu pikachu = new Pikachu();
		Squirtle squirtle = new Squirtle();
		Bulbasaur bulbasaur = new Bulbasaur();

		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();

		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();

		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();

		pikachu.atacarAraniazo();
		pikachu.atacarImpactrueno();
	}
}
