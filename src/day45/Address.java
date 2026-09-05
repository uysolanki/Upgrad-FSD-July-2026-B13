package day45;

public class Address {
	private int houseNumber;
    private String street;
    private String city;
    private int pinCode;
    private String houseType;
    
    public Address() {}
	public Address(int houseNumber, String street, String city, int pinCode, String houseType) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
		this.houseType = houseType;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode
				+ ", houseType=" + houseType + "]";
	}
    
    
}
