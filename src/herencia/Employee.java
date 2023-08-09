package herencia;

public class Employee extends Person {
	int fileNumber;
	String post;
	double salary;

	public Employee() {
	}

	public Employee(int _id, String _dni, String _name, String _lastName, String _home, String _phone, int _fileNumber,
	                String _post, double _salary) {
		super(_id, _dni, _name, _lastName, _home, _phone);
		this.fileNumber = _fileNumber;
		this.post = _post;
		this.salary = _salary;
	}

	public int getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(int _fileNumber) {
		this.fileNumber = _fileNumber;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String _post) {
		this.post = _post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double _salary) {
		this.salary = _salary;
	}
}
