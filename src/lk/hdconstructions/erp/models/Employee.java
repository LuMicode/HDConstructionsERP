package lk.hdconstructions.erp.models;

public class Employee {
	private String empTitle;
	private int empNic;
	private int empId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String address;
	
	public Employee(String empTitle, int empNic,String firstName, String lastName, String telephone, String address ) {
		this.empTitle = empTitle;
		this.empNic = empNic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.address = address;
	}
	
	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}
	
	public void setEmpNic(int empNic) {
		this.empNic = empNic;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmpTitle() {
		return empTitle;
	}
	
	public int getEmpNic() {
		return empNic;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTelephone() {
		return telephone;
	}
}
