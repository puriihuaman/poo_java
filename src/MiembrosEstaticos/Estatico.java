package MiembrosEstaticos;

public class Estatico {
	private String frase = "POO - Estáticos";
	private static String title = "Miembros Estáticos en Java";

	public Estatico() {
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String _frase) {
		this.frase = _frase;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String _title) {
		Estatico.title = _title;
	}

	public static int sumar(int n1, int n2) {
		return n1 + n2;
	}
}
