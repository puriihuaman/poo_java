package herencia;

public class Person {
	int id;
	String dni;
	String name;
	String lastName;
	String home;
	String phone;

	public Person() {
	}

	public Person(int _id, String _dni, String _name, String _lastName, String _home, String _phone) {
		this.id = _id;
		this.dni = _dni;
		this.name = _name;
		this.lastName = _lastName;
		this.home = _home;
		this.phone = _phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String _dni) {
		this.dni = _dni;
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

	public String getHome() {
		return home;
	}

	public void setHome(String _home) {
		this.home = _home;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String _phone) {
		this.phone = _phone;
	}
}
