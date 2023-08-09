package Method;

public class Cubo {
	int capacidad;
	int contenido;

	public Cubo(int _capacidad) {
		this.capacidad = _capacidad;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public int getContenido() {
		return this.contenido;
	}

	public void setCapacidad(int _capacidad) {
		this.capacidad = _capacidad;
	}

	public void setContenido(int _contenido) {
		this.contenido = _contenido;
	}

	public void vacia() {
		this.contenido = 0;
	}
	public void llena() {
		this.contenido = this.capacidad;
	}
	public void pinta() {
		for (int nivel = this.capacidad; nivel > 0; nivel--) {
			if (this.contenido >= nivel) {
				System.out.println("#~~~~~~#");
			} else {
				System.out.println("#      #");
			}
		}
		System.out.println("#########");
	}
	public void vuelcaEn(Cubo _destino) {
		int libres = _destino.getCapacidad() - _destino.getContenido();

		if (libres > 0) {
			if (this.contenido <= libres) {
				_destino.setContenido(_destino.getContenido() + this.contenido);
				this.vacia();
			} else {
				this.contenido -= libres;
				_destino.llena();
			}
		}
	}
}
