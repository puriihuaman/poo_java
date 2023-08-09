package polimorfismo;

public class Boss extends Person {
	int idBoss;
	String bossDepartament;

	public Boss() {
	}

	public Boss(int _id, String _dni, String _name, String _lastName, String _home, String _phone, int _idBoss,
	            String _bossDepartament) {
		super(_id, _dni, _name, _lastName, _home, _phone);
		this.idBoss = _idBoss;
		this.bossDepartament = _bossDepartament;
	}

	public int getIdBoss() {
		return idBoss;
	}

	public void setIdBoss(int _idBoss) {
		this.idBoss = _idBoss;
	}

	public String getBossDepartament() {
		return bossDepartament;
	}

	public void setBossDepartament(String _bossDepartament) {
		this.bossDepartament = _bossDepartament;
	}
}
