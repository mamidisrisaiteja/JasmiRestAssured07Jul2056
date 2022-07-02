package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	

public class StepDefinition {

	RequestSpecification reqs;
	Response resp;
	@Given("Add Place Payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions
		  RestAssured.baseURI="https://rahulshettyacademy.com";
		  reqs=RestAssured.given();
	}
	@When("user calls {string} with Post HTTP request")
	public void user_calls_with_post_http_request(String string) {
		resp=             reqs.queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body("{\r\n"
	+ "  \"location\": {\r\n"
	+ "    \"lat\": -38.383494,\r\n"
	+ "    \"lng\": 33.427362\r\n"
	+ "  },\r\n"
	+ "  \"accuracy\": 50,\r\n"
	+ "  \"name\": \"Frontline house\",\r\n"
	+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
	+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
	+ "  \"types\": [\r\n"
	+ "    \"shoe park\",\r\n"
	+ "    \"shop\"\r\n"
	+ "  ],\r\n"
	+ "  \"website\": \"http://google.com\",\r\n"
	+ "  \"language\": \"French-IN\"\r\n"
	+ "}\r\n"
	+ "")
                .post("maps/api/place/add/json");
	}
	@Then("the API call gets success with status code {int}")
	public void the_api_call_gets_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		int x=int1;
		 resp.then().assertThat().statusCode(x);
		 resp.prettyPrint();
	}
	



}
