package testUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataProvider {
	
			
 public static Object[] dataProvider() {
	 
	 JSONParser parser = new JSONParser();
	 JSONObject obj=null;
	 
	
	 try {
		FileReader reader = new FileReader("C:\\Users\\abdit\\EclipseWorkSpaces\\EclipseWorkSpace05\\CleverMediaCucumberProject"
				+ "\\src\\test\\resources\\Data\\Data.json");
		obj = (JSONObject)parser.parse(reader);
	} catch (IOException | ParseException exception) {
		exception.printStackTrace();
	}
	 //Store jsonobject in jsonarray
	 
	 JSONArray cusinfojsonarray = (JSONArray)obj.get("Data");
	
	 String[] data = new String[cusinfojsonarray.size()];
	 
	 for (int i=0; i<cusinfojsonarray.size(); i++) {
		 
		obj = (JSONObject)cusinfojsonarray.get(i);
		
		String firstname = (String)obj.get("firstName");
		String lastname = (String)obj.get("lastName");
		String zipcode = (String)obj.get("zipCode");
		String message = (String)obj.get("Message");
		
		data[i] = firstname + "," + lastname + "," + zipcode + "," +  message;
	 }
	 
	 
	// Object[] data = new Object[1];
	 
	 return new Object[] {data};
	 
 	}
}


