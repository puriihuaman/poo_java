package EjerciciosPOO.Ejercicio02;

public class Board {
	private int x;
	private int y;

	public Board(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveLeft(int _decrement) {
		this.x -= _decrement;
	}

	public void moveRight(int _increment) {
		this.x += _increment;
	}

	public void moveUp(int _increment) {
		this.y += _increment;
	}

	public void moveDown(int _decrement) {
		this.y -= _decrement;
	}
}
