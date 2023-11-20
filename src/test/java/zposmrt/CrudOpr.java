package zposmrt;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CrudOpr {
	//int id;	
@Test
public void fetchDatafromJSONfile() throws JsonGenerationException, JsonMappingException, IOException {
	File fl = new File("./abc.json");
	
	Response resp=given().body(fl).contentType(ContentType.JSON)
	 
	.when().post("https://petstore.swagger.io/v2/pet");
	int id=resp.jsonPath().get("id");
	System.out.println(id);
	resp.then().contentType(ContentType.JSON).log().all();
	
	when().get("https://petstore.swagger.io/v2/pet/"+id)
	.then().log().all();
	
ObjectMapper omap=new ObjectMapper();
JSONObject jobj=new JSONObject();
jobj.put("id", 5);
omap.writerWithDefaultPrettyPrinter().writeValue(new File("./abc.json"), jobj);
	when().put("https://petstore.swagger.io/v2/pet")
	.then().log().all();
	
}
@Test
public void getData()
{

}
}