package MiembrosEstaticos;

public class Main {
	public static void main(String[] args) {
		Estatico obj1 = new Estatico();
		Estatico obj2 = new Estatico();

		obj2.setFrase("Obj2 - POO - Estáticos");

		System.out.println(obj1.getFrase());
		System.out.println(obj2.getFrase());

		System.out.println("## Miembros estáticos ##");
		System.out.println(Estatico.getTitle());
		Estatico.setTitle("Estamos viendo Miembros Estáticos con Java");
		System.out.println(Estatico.getTitle());

		System.out.println(Estatico.sumar(2, 5));
	}
}
