package com.apiresponse.model;

import java.util.List;

/** A Java class that represents response JSON of Bikes API */

public class ApiResponse {
	
	List<CityBike> networks;

	public List<CityBike> getNetworks() {
		return networks;
	}

	public void setNetworks(List<CityBike> networks) {
		this.networks = networks;
	} 

}
