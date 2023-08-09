package Method;

public class Cuadrado {
	int lado;

	public Cuadrado(int _lado) {
		this.lado = _lado;
	}

	public String toString() {
		int i, espacios;
		String resultado = "";

		for (int j = 0; j < this.lado; j++) {
			resultado += "█ █";
		}
		resultado += "\n";

		for (i = 1; i < this.lado; i++) {
			resultado += "█ █";

			for (espacios = 1; espacios < this.lado - 1; espacios++) {
				resultado += " ";
			}
			resultado += "█ █\n";
		}

		for (i = 0; i < this.lado; i++) {
			resultado += "█ █";
		}
		resultado += "\n";
		return resultado;
	}
}
