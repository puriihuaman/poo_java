package ejerciciopoo;

public class Employee extends Person {
	private double salary;
	private String category;
	private Address address;
	private Department department;

	public Employee() {
	}

	public Employee(String _dni, String _name, int _age, String _state, double _salary, String _category,
	 Address _address, Department _department) {
		super(_dni, _name, _age, _state);
		this.salary = _salary;
		this.category = _category;
		this.address = _address;
		this.department = _department;
		this.department.altaEmpleado(this);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double _salary) {
		this.salary = _salary;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String _category) {
		this.category = _category;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address _address) {
		this.address = _address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department _department) {
		this.department = _department;
	}

	public double netSalary(double _discount) {
		return this.salary - _discount;
	}

	@Override
	public String toString() {
		return "Employee{" + "salary=" + salary + ", category='" + category + '\'' + ", address=" + address + ", department=" + department.getName() + '}';
	}
}
