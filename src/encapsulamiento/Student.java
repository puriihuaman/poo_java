package encapsulamiento;

public class Student {
	private int id;
	private String name;
	private String lastName;

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

	@Override
	public String toString() {
		return String.format("Student{ id: %d, name: %s, lastName: %s }", id, name, lastName);
	}
}
