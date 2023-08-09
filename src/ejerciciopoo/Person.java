package ejerciciopoo;

public class Person {
	private String dni;
	private String name;
	private int age;
	private String state;

	public Person() {
	}

	public Person(String _dni, String _name, int _age, String _state) {
		this.dni = _dni;
		this.name = _name;
		this.age = _age;
		this.state = _state;
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

	public int getAge() {
		return age;
	}

	public void setAge(int _age) {
		this.age = _age;
	}

	public String getState() {
		return state;
	}

	public void setState(String _state) {
		this.state = _state;
	}

	@Override
	public String toString() {
		return "Person{" + "dni='" + dni + '\'' + ", name='" + name + '\'' + ", age=" + age + ", state='" + state + '\'' + '}';
	}
}
