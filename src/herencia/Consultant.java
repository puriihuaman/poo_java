package herencia;

public class Consultant extends Person {
	String consultantName;
	int consultantNumber;

	public Consultant() {
	}

	public Consultant(int _id, String _dni, String _name, String _lastName, String _home, String _phone,
	                  String _consultantName, int _consultantNumber) {
		super(_id, _dni, _name, _lastName, _home, _phone);
		this.consultantName = _consultantName;
		this.consultantNumber = _consultantNumber;
	}

	public String getConsultantName() {
		return consultantName;
	}

	public void setConsultantName(String _consultantName) {
		this.consultantName = _consultantName;
	}

	public int getConsultantNumber() {
		return consultantNumber;
	}

	public void setConsultantNumber(int _consultantNumber) {
		this.consultantNumber = _consultantNumber;
	}
}
