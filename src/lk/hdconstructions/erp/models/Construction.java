package lk.hdconstructions.erp.models;

public class Construction {
	
	private int cid;
	private String name;
	private String address;
	private String constructionJob;
	private String description;
	
	public Construction(int cid, String name, String address, String constructionJob, String description) {
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.constructionJob = constructionJob;
		this.description = description;
		
	}
	
	public int getCid() {
		return cid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getConstructionJob() {
		return constructionJob;
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
	
	public void setConstructionJob(String constructionJob) {
		this.constructionJob = constructionJob;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
