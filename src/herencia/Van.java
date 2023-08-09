package herencia;

// Furgoneta <-- Coche
public class Van extends Car {
	private int loadCapacity;
	private int extraPlaces;

	public Van(int _loadCapacity, int _extraPlaces) {
		super();
		this.loadCapacity = _loadCapacity;
		this.extraPlaces = _extraPlaces;
	}
}
