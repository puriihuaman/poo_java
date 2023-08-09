package encapsulamiento;

public class Main {
	public static void main(String[] args) {
		Student pedro = new Student(8, "Pedro", "Purihuaman");
		Student hailee = new Student();

		System.out.println(pedro);
		System.out.println(hailee);

		hailee.setId(26);
		hailee.setName("Hailee");
		hailee.setLastName("Steinfeld");

		System.out.println(pedro);
		System.out.println(hailee);
	}
}
