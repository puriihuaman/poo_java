package logic;

public class Student {
	int id;
	String name;
	String lastName;

	public Student() {
	}

	public Student(int _id, String _name, String _lastName) {
		this.id = _id;
		this.name = _name;
		this.lastName = _lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
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

	public void fullName() {
		String text = String.format("Nombre %s, Apellido %s", this.name, this.lastName);
		System.out.println(text);
	}

	public void isApproved(double _qualification) {
		String message;
		message = _qualification >= 6 ? "APROBE LA MATERIA" : "DESAPROBE LA MATERIA";
		System.out.println(message);
	}
}
