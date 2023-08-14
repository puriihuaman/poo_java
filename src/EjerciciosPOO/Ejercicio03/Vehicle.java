package EjerciciosPOO.Ejercicio03;

public class Vehicle {
	private String brand;
	private String model;
	private double price;

	public Vehicle(String _brand, String _model, double _price) {
		this.brand = _brand;
		this.model = _model;
		this.price = _price;
	}

	public double getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String showData() {
		return String.format("Vehiculo { \n\tmarca: %s \n\tmodelo: %s \n\tprecio: %f \n}", this.brand, this.model,
			this.price);
	}
}
