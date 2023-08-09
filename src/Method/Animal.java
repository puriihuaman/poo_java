package Method;

public class Animal {
	private final Sexo sexo;

	public Animal() {
		this.sexo = Sexo.MACHO;
	}

	public Animal(Sexo _sexo) {
		this.sexo = _sexo;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	@Override
	public String toString() {
		return "Sexo: " + this.sexo + "\n";
	}

	public void duerme() {
		System.out.println("ZZZZZZZ");
	}
}
