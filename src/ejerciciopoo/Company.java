package ejerciciopoo;

import java.util.ArrayList;

public class Company {

	private String name;
	private String cif;
	private Address address;
	private ArrayList<Department> departments;

	public Company() {
	}

	public Company(String _name, String _cif, Address _address) {
		this.name = _name;
		this.cif = _cif;
		this.address = _address;
		this.departments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String _cif) {
		this.cif = _cif;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address _address) {
		this.address = _address;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> _departments) {
		this.departments = _departments;
	}

	//alta de un departamento en la empresa
	public void altaDepartamento(Department dpto) {
		if (!departments.contains(dpto)) {
			departments.add(dpto);
		}
	}

	//baja de un departamento en la empresa
	public void bajaDepartamento(Department dpto) {
		if (departments.contains(dpto)) {
			departments.remove(dpto);
		}
	}

	@Override
	public String toString() {
		return "Company{" + "name='" + name + '\'' + ", cif='" + cif + '\'' + ", address=" + address + ", departments=" + departments + '}';
	}
}
