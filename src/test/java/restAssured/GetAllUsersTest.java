package restAssured;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetAllUsersTest {
	@Test
	public void geAllPosts() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
		String Resp = given().when().get("").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("Response is\t" + Resp);
	}

	@Test
	public void postRequest() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		String requestBody =

				"{\"mode\": \"raw\",\"raw\": \"{\\r\\n\\t\\\"title\\\": \\\"foo\\\",\\r\\n  \\\"body\\\": \\\"bar\\\",\\r\\n  \\\"userId\\\": 1\\r\\n}\"}";

		Response response = given().header("Content-type", "application/json").and().body(requestBody).when()
				.post("/posts").then().extract().response();
		Assert.assertEquals(201, response.statusCode());

	}
}
