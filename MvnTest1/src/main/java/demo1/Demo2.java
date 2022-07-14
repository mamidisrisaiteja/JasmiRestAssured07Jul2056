package demo1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) throws Exception, ParseException {
		// TODO Auto-generated method stub
//We will specify the base URI here
//RestAssured is the java library which will automate the apis built on rest
//Junit or TestNg  --> there are simply know as test runners, they will run your testscripts without use of main method
//so our scripts wont run as Java application rather they run as Junit or TestNG
// here the test execution willbe taken care by any one of the above test runners

//Cucumber or Jbehave, these are the libraries required for building BDD capabilities
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		RequestSpecification resp=RestAssured.given(); //just declared the request obect
		   
		
JSONParser jsonParser=new JSONParser();//access to JSON data,to internally handle json objects
FileReader fr=new FileReader("C:\\Users\\AN574BV\\git\\JasmiRestAssured07Jul2056\\MvnTest1\\src\\main\\java\\resources\\placeLocation.json"); //java class to read a file
Object obj=jsonParser.parse(fr); // storign the content of file into java object

 JSONObject jsonobj=(JSONObject)obj;  // we are converting or type casting java object into json object,this json object represents deserilized data
String strObj=jsonobj.toString(); // converting to serailized data , nothing but converting to string so as to transfer thru network
//Serialization and Deserialization
 //JSON data(it represents content in bulk or knows as deserialized data), to post this data into server from client, we need to transfer through network which only accepts serialized(data in String fromat) daat
 
		Response response  =resp.queryParam("key","qaclick123")  // here we are completely creating request sepciifcation and assignin the value to respnsoe object
		                  
		                  .body(strObj)
		                  .post("maps/api/place/add/json");
		response.prettyPrint();
		                  
	}

}
