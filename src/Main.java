import logic.Student;
import logic.Animal;

public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Perro");

		animal1.setName("Dog");
		System.out.println(animal1.getName());

		Student alumno = new Student(1, "Pedro", "Puri");
		alumno.isApproved(7);
		alumno.fullName();

		final double PI = Math.PI;
	}
}