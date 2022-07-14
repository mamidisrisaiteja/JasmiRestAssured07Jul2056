package resources;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class libFunctions {
	
	public static String jSONReader(String x) throws Exception {
	
	JSONParser jsonParser=new JSONParser();//access to JSON data,to internally handle json objects
	String location=x;
	FileReader fr=new FileReader(location); //java class to read a file
	Object obj=jsonParser.parse(fr); // storign the content of file into java object

	 JSONObject jsonobj=(JSONObject)obj;  // we are converting or type casting java object into json object,this json object represents deserilized data
	String strObj=jsonobj.toString(); // converting to serailized data , nothing but converting to string so as to transfer thru network
	return strObj;
	}

}
