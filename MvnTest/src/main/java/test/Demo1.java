package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    RestAssured.baseURI="https://rahulshettyacademy.com";
    RequestSpecification reqs=RestAssured.given();
    
    Response resp=             reqs.queryParam("key", "qaclick123")
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
    
    resp.prettyPrint();
    resp.then().assertThat().statusCode(200);

	}

}
