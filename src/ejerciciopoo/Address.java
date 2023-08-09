package ejerciciopoo;

public class Address {
	private String street; // calle
	private int number;
	private int postalCode;
	private String location;
	private String province;

	public Address() {
	}

	public Address(String _street, int _number, int _postalCode, String _location, String _province) {
		this.street = _street;
		this.number = _number;
		this.postalCode = _postalCode;
		this.location = _location;
		this.province = _province;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String _street) {
		this.street = _street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int _number) {
		this.number = _number;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int _postalCode) {
		this.postalCode = _postalCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String _location) {
		this.location = _location;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String _province) {
		this.province = _province;
	}

	@Override
	public String toString() {
		return "Address{" + "street='" + street + '\'' + ", number=" + number + ", postalCode=" + postalCode + ", location='" + location + '\'' + ", province='" + province + '\'' + '}';
	}
}
