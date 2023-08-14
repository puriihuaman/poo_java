package Relaciones;

import java.util.List;

public class Car {
	private Long id;
	private String brand;
	private String model;
	private Owner owner; // Relación 1 a 1
	private List<Owner> owners; // Relación 1 a N

	public Car() {
	}

	public Car(Long _id, String _brand, String _model, List<Owner> _owners) {
		this.id = _id;
		this.brand = _brand;
		this.model = _model;
		this.owners = _owners;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long _id) {
		this.id = _id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String _brand) {
		this.brand = _brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String _model) {
		this.model = _model;
	}

	public List<Owner> getOwners() {
		return owners;
	}

	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}

	@Override
	public String toString() {
		return String.format("Car { id: %s, Marca: %s, Modelo: %s }", id, brand, model);
	}
}
