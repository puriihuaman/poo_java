package ejerciciopoo;

import java.util.ArrayList;

public class Department {
	private String name;
	private int id;
	private String location;
	private Company company;
	private ArrayList<Employee> employees;

	public Department() {
	}

	public Department(String _name, int _id, String _location, Company _company) {
		this.name = _name;
		this.id = _id;
		this.location = _location;
		this.company = _company;
		employees = new ArrayList<>();
		_company.altaDepartamento(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String _location) {
		this.location = _location;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company _company) {
		this.company = _company;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> _employees) {
		this.employees = _employees;
	}

	//alta de un empleado en el departamento
	public void altaEmpleado(Employee emp) {
		if (!employees.contains(emp)) {
			employees.add(emp);
			emp.setDepartment(this); //el empleado tiene que reflejar el alta
		}
	}

	// baja de un empleado del departamento
	public void bajaEmpleado(Employee emp) {
		if (employees.contains(emp)) {
			employees.remove(emp);
			emp.setDepartment(null); //el empleado tiene que reflejar la baja
		}
	}
}