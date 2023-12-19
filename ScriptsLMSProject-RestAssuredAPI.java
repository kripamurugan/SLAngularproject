package restassuredscripts;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ScriptsLMSProject {
	
	@Test(priority='1')
	public void BaseURL()
	{
		Response res=RestAssured.get("https://reqres.in/api");
		
		System.out.println(res.asString());
		
		System.out.println(res.asPrettyString());
		
		System.out.println(res.getStatusCode());
		
	}
	
		@Test(priority='2')
		public void RegisterUserURL() {
			
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");
		
		RestAssured
		.given().baseUri("https://reqres.in/")
		.basePath("api/register")
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(200).log().all();
		}


	
	@Test(priority='3')
	public void GetUserURL() {
		
		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.when().get()
		.then()
		.statusCode(200)
		.contentType("application/json; charset=utf-8")
		.log().all();
	}
}
