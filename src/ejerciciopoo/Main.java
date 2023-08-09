package ejerciciopoo;

public class Main {
	public static void main(String[] args) {

		// TODO code application logic here
		// 1 - creamos la empresa
		Address dir1 = new Address("Avenida de Bruselas", 35, 28108, "Alcobendas", "Madrid");
		Company e1 = new Company("Indra", "1234567", dir1);
		//2 - creamos los departamentos
		Department d1 = new Department("Informática", 1, "Madrid", e1);
		Department d2 = new Department("Personal", 2, "Barcelona", e1);
		//3 - creamos los empleados que asignamos a los departamentos
		Address diremp1 = new Address("Paseo de la Estación", 5, 28803, "Alcalá de Henares", "Madrid");
		Employee emp1 = new Employee("1234", "Pepe", 25, "soltero", 1500, "programador", diremp1, d1);
		Address diremp2 = new Address("Mayor", 18, 28801, "Alcalá de Henares", "Madrid");
		Employee emp2 = new Employee("4567", "Laura", 35, "casada", 2000, "analista", diremp2, d1);
		Address diremp3 = new Address("Santiago", 7, 28801, "Alcalá de Henares", "Madrid");
		Employee emp3 = new Employee("5678", "Maria", 40, "casada", 2500, "gerente", diremp3, d2);
		System.out.println(e1.toString());
		System.out.println(d1.toString());
		System.out.println(emp2.toString());
		System.out.println("Sueldo neto: " + emp2.netSalary(25));
	}
}

//jdbc y/o jpa