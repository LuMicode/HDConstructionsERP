package lk.hdconstructions.erp.models;

public class Customer {
	
	private int cusid;
	private String name;
	private String address;
	private int tel;
	private String description;
	
	public Customer(int cusid, String name, String address, int tel, String description) {
		this.cusid = cusid;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.description = description;
	}
	

	public int getID() {
    	return cusid;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public int getTel() {
    	return tel;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public void setTel(int tel) {
    	this.tel = tel;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
}
