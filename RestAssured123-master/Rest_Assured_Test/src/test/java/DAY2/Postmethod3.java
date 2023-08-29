package DAY2;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class Postmethod3 {
	
	@Test
	public void Postusing_pojo()
	{
		Postmethod2 Data = new Postmethod2();
		
		Data.setJob("Teacher");
		Data.setName("Pooja");
		
		given().contentType("application/json").body(Data.toString())
		
		.when().post("https://reqres.in/api/users")
		
		.then().statusCode(201).body("Name" ,equalTo("Pallavi")).log().all();
		
		
		
		
		
	}

}
