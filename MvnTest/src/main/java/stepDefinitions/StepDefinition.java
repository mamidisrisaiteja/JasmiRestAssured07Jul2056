package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.libFunctions;

	

public class StepDefinition {

	RequestSpecification reqs;
	Response resp,resp1;
	String fileLocation="C:\\\\Users\\\\AN574BV\\\\git\\\\JasmiRestAssured07Jul2056\\\\MvnTest1\\\\src\\\\main\\\\java\\\\resources\\\\placeLocation.json";
	@Given("Add Place Payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions
		  RestAssured.baseURI="https://rahulshettyacademy.com";
		  reqs=RestAssured.given();
	}
	@When("user calls {string} with Post HTTP request")
	public Response user_calls_with_post_http_request(String string) throws Exception {
		resp=             reqs.queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body(libFunctions.jSONReader(fileLocation))
                .post("maps/api/place/add/json");
		
		return resp;
	}
	@Then("the post API call gets success with status code {int}")
	public Response the_api_call_gets_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		int x=int1;
		 resp.then().assertThat().statusCode(x);
		 resp.prettyPrint();
		
		 String s=resp.jsonPath().getString("place_id");
		 System.out.println("the paleId is " + s);
		 return resp;
		 
		
		
	}
	
@When("user calls {string} with Get HTTP request")
	public void user_calls_with_get_http_request(String string) throws Exception {
	
	String s=string;
	resp1=reqs.queryParam("place_id",user_calls_with_post_http_request(s).jsonPath().getString("place_id"))
            .queryParam("key", "qaclick123").headers("Content-Type","application/json")
            .get("/maps/api/place/get/json");
	}

@Then("the get API call gets success with status code {int}")
public void the_api_call_gets_success_with_status_code1(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	int x=int1;
	 resp1.then().assertThat().statusCode(x);
	 resp1.prettyPrint();
	
	
	
}
	
}



