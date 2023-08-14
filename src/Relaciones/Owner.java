package Relaciones;

public class Owner {
	private Long id;
	private String name;
	private String lastName;

	public Owner() {
	}

	public Owner(Long _id, String _name, String _lastName) {
		this.id = _id;
		this.name = _name;
		this.lastName = _lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long _id) {
		this.id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String _lastName) {
		this.lastName = _lastName;
	}

	@Override
	public String toString() {
		return String.format("Propietario { id: %s, Nombre: %s, Apellido: %s }", id, name, lastName);
	}
}
