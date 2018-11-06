package lk.hdconstructions.erp.models;

public class Customer {

    private String nic;
    private String title;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String telephone;

    public Customer(String nic, String title,  String firstName, String lastName, String company, String address, String tel) {
            this.nic = nic;
            this.title = title;
            this.firstName = firstName;
            this.lastName = lastName;
            this.company = company;
            this.address = address;
            this.telephone = tel;
    }

    
	
    public String getTitle() {
            return title;
    }

    public String getNIC() {
    	return nic;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public String getTelephone() {
    	return telephone;
    }
    
    public String getCompany() {
    	return company;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setTitle(String title) {
		this.title = title;
	}
    
    public void setNic(String nic) {
		this.nic = nic;
	}
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public void setTelephone(String tel) {
    	this.telephone = tel;
    }
    
    public void setCompany(String company) {
    	this.company = company;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    // get full name
    public String getName() {
    	return firstName+" "+lastName;
    }

}
