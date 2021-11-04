package com.apiresponse.model;

/** A Java class that represents a part of response JSON of Bikes API */

public class Location {

	private String city;
	private String country;
	private String latitude;
	private String longitude;
	
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
}
