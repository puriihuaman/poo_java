package Ejercicio;

public class Bush extends Plant {
	private double width;
	private boolean isDomestic;
	private String variety; // Variedad
	private String leafColor; // Color de hoja
	private boolean prunedOrNot; // Se poda o no

	public Bush() {
	}

	public Bush(String _name, double _stemHeight, boolean _hasLeaves, String _idealClimate, double _width, boolean _isDomestic, String _variety, String _leafColor, boolean _prunedOrNot) {
		super(_name, _stemHeight, _hasLeaves, _idealClimate);
		this.width = _width;
		this.isDomestic = _isDomestic;
		this.variety = _variety;
		this.leafColor = _leafColor;
		this.prunedOrNot = _prunedOrNot;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double _width) {
		this.width = _width;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean _domestic) {
		isDomestic = _domestic;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String _variety) {
		this.variety = _variety;
	}

	public String getLeafColor() {
		return leafColor;
	}

	public void setLeafColor(String _leafColor) {
		this.leafColor = _leafColor;
	}

	public boolean isPrunedOrNot() {
		return prunedOrNot;
	}

	public void setPrunedOrNot(boolean _prunedOrNot) {
		this.prunedOrNot = _prunedOrNot;
	}

	@Override
	public void showMessage() {
		System.out.println("Hola, soy un arbusto.");
	}
}
