package crudOperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {

	public static void main(String[] args) {
		
		//Step1: create the body
		
		//Step2: Send Request
		Response resp = RestAssured.get("https://reqres.in/api/users");
	
		//Step3: Capture the response
		resp.then().log().all();
		
	
	
	}

}
