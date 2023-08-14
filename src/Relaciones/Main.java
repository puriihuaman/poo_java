package Relaciones;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Car auto = new Car();

		auto.setId(1L);
		auto.setBrand("Ferrari");
		auto.setModel("F23");

		List<Owner> listOwners = new LinkedList<>();
		Owner owner1 = new Owner(33L, "Tony", "Kroos");
		Owner owner2 = new Owner(24L, "Pedro", "Puri");

		listOwners.add(owner1);
		listOwners.add(owner2);

		auto.setOwners(listOwners);

		System.out.println(auto.getBrand());
		System.out.println(auto.getModel());
		for (Owner owner : auto.getOwners()) {
			System.out.println(owner);
		}

	}
}
