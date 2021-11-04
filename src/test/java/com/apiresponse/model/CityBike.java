package com.apiresponse.model;

/** A Java class that represents a part of response JSON of Bikes API */

public class CityBike {
	
	/* java.lang.Object is used as data type for company as it's type in the API JSON response is not consistent.
	At some places it is an array of strings in JSON response. And, at some places it is just a string
	*/
	private Object company;  
	private String href;  
	private String id;
	private Location location;
	private String name;
	private String source;
	private String gbfs_href;
	private License license;
	
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	public String getGbfs_href() {
		return gbfs_href;
	}
	public void setGbfs_href(String gbfs_href) {
		this.gbfs_href = gbfs_href;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Object getCompany() {
		return company;
	}
	public void setCompany(Object company) {
		this.company = company;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
