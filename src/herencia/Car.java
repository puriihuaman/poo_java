package herencia;

public class Car {
	private int wheels;
	private int length;
	private int width;
	private int engine;
	private int platformWeight;
	private String color;
	private int totalWeight;
	private boolean leatherSeats, airConditioner;

	public Car() {
		wheels = 4;
		length = 400;
		width = 300;
		engine = 1600;
		platformWeight = 500;
	}

	public String generalData() {
		return String.format("La plataforma del vehículo tiene %d ruedas. Mide %d metros con un ancho de %d cm y un peso de plataforma de %d kg",	wheels,
			(length/1000), width, platformWeight);
	}

	public void setColor(String _color) {
		this.color  = _color;
	}
	public String color() {
		return String.format("El color del coche es %s", color);
	}

	public void configureSeats(String _leatherSeats) {
		this.leatherSeats = _leatherSeats.equalsIgnoreCase("si");
	}

	public String tellMeSeats() {
		return this.leatherSeats ? "El coche tiene asietnos de cuero" : "El coche tiene asientos de serie";
	}
}
