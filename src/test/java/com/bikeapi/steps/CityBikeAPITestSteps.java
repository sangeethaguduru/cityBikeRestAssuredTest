package com.bikeapi.steps;

import static io.restassured.RestAssured.given;
import org.junit.Assert;
import com.apiresponse.model.ApiResponse;
import com.apiresponse.model.CityBike;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/** This contains implementation for each of steps provided in feature file */

public class CityBikeAPITestSteps {
	
		RequestSpecification requestSpec;
	    Response response;

	    @Given("I am using CityBikeAPI")
	    public void iAmUsingCityBikeAPI() {
	        // Create request
	        requestSpec = new RequestSpecBuilder().build();
	        requestSpec.baseUri("http://api.citybik.es");
	    }

	    @When("I call retrieve location details")
	    public void iCallRetrieveLocationDetails() {
	        // Define path for call
	        requestSpec.basePath("/v2/networks");
	        

	        // Get response for the API call
	        response = given()
	                .spec(requestSpec)
	                .get();
	    }

	    @Then("^(.*) is in (.*)$")
	    public void cityInCountry(String city, String country) {
	    	
	    	boolean matchFound = false;
	    	String latitude = null ;
	    	String longitude = null ; 
	    	
	        // Assert response is 200
	        int statusCode = response.getStatusCode();
	        Assert.assertEquals(statusCode, 200);

	        	        	    	 
	        //deserialize JSON response in to java object model
	        ApiResponse apiResponse = response.getBody().as(ApiResponse.class);
	        
	        //Iterate through JSON response in java and find a match for city and country combination
	    	for(CityBike cityBike : apiResponse.getNetworks())
	    	{
	    		if(cityBike.getLocation() != null && cityBike.getLocation().getCity() != null && cityBike.getLocation().getCity().equals(city) && 
	    				cityBike.getLocation().getCountry() != null && cityBike.getLocation().getCountry().equals(country) ) {
	    			matchFound = true;
	    			latitude = cityBike.getLocation().getLatitude();
	    			longitude = cityBike.getLocation().getLongitude();
	    			break;
	    		}
	    	}
	    	
	    	Assert.assertTrue(matchFound);
	    	
	    	if(matchFound)
	    	{
	    		System.out.println(city+" is in "+ country);
	    		System.out.println(city + " latitude is " + latitude + " and longitude is " + longitude);
	    	}
	    }
	    
	  
}
