package restAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.Test;
import org.junit.Assert;

public class RequestsAPIs {

	int successStatusCode = 200;
	String title = "foo";
	String body = "bar";
	int userId = 1;

	String baseURI = "https://jsonplaceholder.typicode.com";
	String basePath = "/posts";

	@Test
	public void postRequest() {
		RestAssured.baseURI = this.baseURI;
		String requestBody = "{\"mode\": \"raw\",\"raw\": \"{\\r\\n\\t\\\"title\\\": \\\"" + title
				+ "\\\",\\r\\n  \\\"body\\\": \\\"" + body + "\\\",\\r\\n  \\\"userId\\\": " + userId + "\\r\\n}\"}";
		Response response = given().header("Content-type", "application/json").and().body(requestBody).when()
				.post(basePath).then().extract().response();
		Assert.assertEquals(201, response.statusCode());
	}

	@Test
	public void validateAccountData() {
		Response response = get(this.baseURI + this.basePath);
		System.out.println(response.andReturn().asString());
		int actualSize = response.andReturn().as(List.class).size();
		System.out.println(actualSize);
		Assert.assertEquals(response.getStatusCode(), successStatusCode);
		Assert.assertEquals(actualSize, 100);
	}
 
	@Test()
	public void getUserDetails_35() {
		Response response = get(this.baseURI + this.basePath + "/35");
		response.then().statusCode(successStatusCode);
		response.then().assertThat().body("id", equalTo(35)).assertThat()
				.body("title", equalTo("id nihil consequatur molestias animi provident")).assertThat()
				.body("userId", equalTo(4));
	}
}