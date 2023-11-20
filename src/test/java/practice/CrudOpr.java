package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CrudOpr {

@Test
public void CrudOperations() {
	JSONObject jobj=new JSONObject();
	jobj.put("id", 4);
	jobj.put("name", "cat");
	jobj.put("status", "in stock");
	
	
	Response resp=given().body(jobj).contentType(ContentType.JSON)
	.when().post("https://petstore.swagger.io/v2/pet");
	int id=resp.jsonPath().get("id");
	resp.then().log().all();
			given().pathParam("aid", id)
	.when().get("https://petstore.swagger.io/v2/pet/{aid}")
	.then().log().all();

JSONObject obj=new JSONObject();
obj.put("id", 4);
obj.put("name", "hen");
obj.put("status", "in stock");
	Response res=given().body(obj).contentType(ContentType.JSON)
			.when().put("https://petstore.swagger.io/v2/pet");
	int pid=res.jsonPath().get("id");
	res.then().log().all();
	
	when().delete("https://petstore.swagger.io/v2/pet"+pid)
	.then().log().all();
}
}
