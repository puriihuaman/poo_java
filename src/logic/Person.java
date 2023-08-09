package logic;

public class Person {
	String name;
	int age;
	String dni;

	// Métodos
	public Person() {
	}

	public Person(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}

	public Person(String _dni) {
		this.dni = _dni;
	}

	public void run() {
		System.out.printf("Soy %s tengo %d años y estoy corriendo una maratón\n", name, age);
	}

	public void run(int km) {
		System.out.printf("He recorrido %d km\n", km);
	}

	public static void main(String [] args) {
		Person person1 = new Person("Pedro", 24);
		person1.run();

		Person person2 = new Person("12345678");
		person2.run(4);
	}
}
