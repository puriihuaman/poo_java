package Method;

public class GatoSimple {
	String color, raza, sexo;
	int edad;
	double peso;

	public GatoSimple(String _sexo) {
		this.sexo = _sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void maulla() {
		System.out.println("Miauuu");
	}

	public void ronronea() {
		System.out.println("Mrrrrrr");
	}
	public void come(String comida) {
		if(comida.equalsIgnoreCase("pescado")) {
			System.out.println("Hmmmm, gracias!!");
		} else {
			System.out.println("Lo siento, yo solo como pescado.");
		}
	}

	public void peleaCon(GatoSimple _contrincante) {
		if (this.sexo.equalsIgnoreCase("hembra")) {
			System.out.println("No me gusta pelear!.");
		} else {
			if (_contrincante.getSexo().equalsIgnoreCase("hembra")) {
				System.out.println("No peleo con gatitas");
			} else {
				System.out.println("Ven aquí que te vas a enterar!");
			}
		}
	}








}
