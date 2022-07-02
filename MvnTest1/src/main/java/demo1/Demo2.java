package demo1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//We will specify the base URI here
//RestAssured is the java library which will automate the apis built on rest
//Junit or TestNg  --> there are simply know as test runners, they will run your testscripts without use of main method
//so our scripts wont run as Java application rather they run as Junit or TestNG
// here the test execution willbe taken care by any one of the above test runners

//Cucumber or Jbehave, these are the libraries required for building BDD capabilities
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		RequestSpecification resp=RestAssured.given(); //just declared the request obect
		   
		
		Response response  =            resp.queryParam("key","qaclick123")  // here we are completely creating request sepciifcation and assignin the value to respnsoe object
		                  .headers("Content-Type","application/json")
		                  .body("{\r\n"
		                  		+ "  \"location\": {\r\n"
		                  		+ "    \"lat\": -38.383494,\r\n"
		                  		+ "    \"lng\": 33.427362\r\n"
		                  		+ "  },\r\n"
		                  		+ "  \"accuracy\": 100,\r\n"
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
		response.prettyPrint();
		                  
	}

}
