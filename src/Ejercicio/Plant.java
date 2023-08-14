package Ejercicio;

public abstract class Plant {
	protected String name;
	protected double stemHeight; // Altura de tallo
	protected boolean hasLeaves; // Hoja
	protected String idealClimate;

	public Plant() {
	}

	public Plant(String _name, double _stemHeight, boolean _hasLeaves, String _idealClimate) {
		this.name = _name;
		this.stemHeight = _stemHeight;
		this.hasLeaves = _hasLeaves;
		this.idealClimate = _idealClimate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStemHeight() {
		return stemHeight;
	}

	public void setStemHeight(double _stemHeight) {
		this.stemHeight = _stemHeight;
	}

	public boolean isHasLeaves() {
		return hasLeaves;
	}

	public void setHasLeaves(boolean _hasLeaves) {
		this.hasLeaves = _hasLeaves;
	}

	public String getIdealClimate() {
		return idealClimate;
	}

	public void setIdealClimate(String _idealClimate) {
		this.idealClimate = _idealClimate;
	}

	protected abstract void showMessage();
}
