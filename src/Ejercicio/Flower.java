package Ejercicio;

public class Flower extends Plant {
	private String petalColor; // Petalo
	private int petalAverage; // Promedio de cantidad de petalos
	private String pistilColor; // Color del pistilo
	private String flowerVariety; // Variedad de flor
	private String bloomingSeason; // Estación de florecimiento

	public Flower() {
	}

	public Flower(String _name, double _stemHeight, boolean _hasLeaves, String _idealClimate, String _petalColor,
	              int _petalAverage, String _pistilColor, String _flowerVariety, String _bloomingSeason) {
		super(_name, _stemHeight, _hasLeaves, _idealClimate);
		this.petalColor = _petalColor;
		this.petalAverage = _petalAverage;
		this.pistilColor = _pistilColor;
		this.flowerVariety = _flowerVariety;
		this.bloomingSeason = _bloomingSeason;
	}

	public String getPetalColor() {
		return petalColor;
	}

	public void setPetalColor(String _petalColor) {
		this.petalColor = _petalColor;
	}

	public int getPetalAverage() {
		return petalAverage;
	}

	public void setPetalAverage(int _petalAverage) {
		this.petalAverage = _petalAverage;
	}

	public String getPistilColor() {
		return pistilColor;
	}

	public void setPistilColor(String _pistilColor) {
		this.pistilColor = _pistilColor;
	}

	public String getFlowerVariety() {
		return flowerVariety;
	}

	public void setFlowerVariety(String _flowerVariety) {
		this.flowerVariety = _flowerVariety;
	}

	public String getBloomingSeason() {
		return bloomingSeason;
	}

	public void setBloomingSeason(String _bloomingSeason) {
		this.bloomingSeason = _bloomingSeason;
	}

	@Override
	protected void showMessage() {
		System.out.println("Hola, soy una flor.");
	}
}
