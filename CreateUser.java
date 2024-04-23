package crudOperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	public static void main(String[] args) {
		
		// Step1: Create the request body if required
		JSONObject j = new JSONObject();
		j.put("name", "morpheus");
		j.put("job", "leader");
		
		//Step 2: Send the Request
		RequestSpecification request = RestAssured.given();
	    request.body(j);
	    request.contentType(ContentType.JSON);
	    
	    Response resp = request.post("https://reqres.in/api/users");  // request is sent
	    
	    //Step3: Capture the response
	    resp.then().log().all();
	    
	  }
}
