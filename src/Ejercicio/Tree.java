package Ejercicio;

public class Tree extends Plant {
	private String variety;
	private String trunkType;
	private double trunkRadius;
	private String color;
	private String typeOfSheets;

	public Tree() {
	}

	public Tree(String _name, double _stemHeight, boolean _hasLeaves, String _idealClimate, String _variety, String _trunkType, double _trunkRadius, String _color, String _typeOfSheets) {
		super(_name, _stemHeight, _hasLeaves, _idealClimate);
		this.variety = _variety;
		this.trunkType = _trunkType;
		this.trunkRadius = _trunkRadius;
		this.color = _color;
		this.typeOfSheets = _typeOfSheets;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getTrunkType() {
		return trunkType;
	}

	public void setTrunkType(String _trunkType) {
		this.trunkType = trunkType;
	}

	public double getTrunkRadius() {
		return trunkRadius;
	}

	public void setTrunkRadius(double _trunkRadius) {
		this.trunkRadius = _trunkRadius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String _color) {
		this.color = _color;
	}

	public String getTypeOfSheets() {
		return typeOfSheets;
	}

	public void setTypeOfSheets(String _typeOfSheets) {
		this.typeOfSheets = _typeOfSheets;
	}

	@Override
	public void showMessage() {
		System.out.println("Hola, soy un árbol.");
	}
}
