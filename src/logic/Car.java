package logic;

public class Car {
	String color;
	String brand;
	double km;

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.color = "Red";
		car1.brand = "Audi";
		car1.km = 0;

		System.out.println(car1.color);
		System.out.println(car1.brand);
		System.out.println(car1.km);
	}
}
