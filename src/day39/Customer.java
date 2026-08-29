package day39;

public class Customer {

	
	private int custId;
	private String custName,custEmail,custCity;
	private long custMobile;
	
	public Customer() {}
	public Customer(int custId, String custName, String custEmail, String custCity, long custMobile) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custCity = custCity;
		this.custMobile = custMobile;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public long getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custCity="
				+ custCity + ", custMobile=" + custMobile + "]";
	}
	public boolean search(String searchEmail) {
		return this.custEmail.equalsIgnoreCase(searchEmail);	
	}
	public boolean search(long searchMobile) {
		return this.custMobile==searchMobile;	
	}
	
	//store 5 Customer objects in an array and implement the following  functionlity
	//search by email
	//search by phone
	
	
}
