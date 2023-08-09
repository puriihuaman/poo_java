package Method;

public class Main {
	public static void main(String[] args) {
		GatoSimple garfield = new GatoSimple("macho");

		System.out.println("Hola gatito");
		garfield.maulla();
		System.out.println("toma tarta");
		garfield.come("Tarta selva negra");
		System.out.println("toma pescado, a ver si esto te gusta");
		garfield.come("pescado");

		GatoSimple tom = new GatoSimple("macho");
		System.out.println("Tom, toma sopita de verduras");
		tom.come("sopa de verduras");

		GatoSimple lisa = new GatoSimple("hembra");

		System.out.println("Gatitos, a ver como maullan");
		garfield.maulla();
		tom.maulla();
		lisa.maulla();

		garfield.peleaCon(lisa);
		lisa.peleaCon(tom);
		tom.peleaCon(garfield);

		// CLASE CUBO
		System.out.println("####### CLASE CUBO ########");
		Cubo cubito = new Cubo(2);
		Cubo cubote = new Cubo(7);

		System.out.println("Cubito: \n");
		cubito.pinta();

		System.out.println("\nCubote: \n");
		cubote.pinta();

		System.out.println("\nLleno el cubito: \n");
		cubito.llena();

		System.out.println("\nEl cubote sigue vacío: \n");
		cubote.pinta();

		System.out.println("\nVuelco lo que tiene cubito dentro de cubote: \n");
		cubito.vuelcaEn(cubote);

		System.out.println("\nCubito: \n");
		cubito.pinta();

		System.out.println("\nCubote: \n");
		cubote.pinta();

		System.out.println("\nAhora vuelco lo que tiene cubote dentro de cubito: \n");
		cubote.vuelcaEn(cubito);

		System.out.println("\nCubito: \n");
		cubito.pinta();

		System.out.println("\nCubote: \n");
		cubote.pinta();

		System.out.println("##### Prueba cuadrado #####");
		Cuadrado cuadradito = new Cuadrado(5);
		System.out.println(cuadradito);
	}
}
