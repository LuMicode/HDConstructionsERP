package lk.hdconstructions.erp.models;

public class Construction {
	
	private Customer customer;
	private int projectId ;
	private String projectName;
	private float price;
	private String address;
	
	public Construction(Customer customer, int projectId, String projectName, int price, String address ) {
		this.customer = customer;
		this.projectId = projectId;
		this.projectName = projectName;
		this.price = price;
		this.address = address;
	}
	
	public Construction(int projectId, String projectName, float price, String address ) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.price = price;
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public int getProjectId() {
		return projectId;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
