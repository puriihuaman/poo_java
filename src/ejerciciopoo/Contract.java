package ejerciciopoo;

import java.time.LocalDate;

public class Contract {
	private LocalDate date;
	private Employee employee;
	private Company company;

	public Contract() {
	}

	public Contract(LocalDate _date, Employee _employee, Company _company) {
		this.date = _date;
		this.employee = _employee;
		this.company = _company;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate _date) {
		this.date = _date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee _employee) {
		this.employee = _employee;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company _company) {
		this.company = _company;
	}

	@Override
	public String toString() {
		return "Contract{" + "date=" + date + ", employee=" + employee + ", company=" + company + '}';
	}
}
