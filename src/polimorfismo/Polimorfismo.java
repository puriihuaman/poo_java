package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Boss boss = new Boss(1, "1234234", "Tony", "Kross", "España", "21342", 8, "Madrid");
		Consultant consultant = new Consultant();
		Person person = new Person(2, "2142342", "Antonio", "Kross", "Alemania", "432342342");
		Employee employee = new Employee(3, "3", "Tony", "Krooss", "Alemania", "87", 8, "jugador", 98542);

		personList.add(boss);
		personList.add(consultant);
		personList.add(employee);
		personList.add(person);

		for (Person element: personList) {
			System.out.printf("Nombre: %s\n", element.getName());
		}

		person = employee; // a una persona le puedo asignar un empleado|consultor|jefe
		// boss = person; // A un jefe|consultor|empleado no lo puedo asignar directamente una persona
		employee = (Employee)person;
		System.out.println(employee.getName());
	}
}
