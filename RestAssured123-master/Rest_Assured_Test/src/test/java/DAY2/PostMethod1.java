package DAY2;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostMethod1 {

	@Test
	public void PostUSINGJson() {

		JSONObject data = new JSONObject();

		data.put("name", "morpheus");

		data.put("job", "leader");
		given() // Use for the pre requests - Headers, etc

				.contentType("application/json").body(data.toString())

				.when().post("https://reqres.in/api/users")

				.then().statusCode(201)

				.log().all();

	}
}
