package zposmrt;

import org.testng.annotations.Test;


import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoPackage.category;
import pojoPackage.pojoClass;
import pojoPackage.tags;
import static io.restassured.RestAssured.*;
import java.io.File;

public class petStr  {

@Test
public void uploadImage() {
	//this code is to upload the image
	String image="C:\\Users\\Admin\\eclipse-workspace\\zposmrt\\openButton.PNG";
	given().multiPart("file",image)
	.when().post("https://petstore.swagger.io/v2/pet/1/uploadImage")
.then().log().all();
}
@Test
public void fetchDatafromJSONfile() {
	File fl = new File("./abc.json");
	given().body(fl).contentType(ContentType.JSON)
	.when().post("https://petstore.swagger.io/v2/pet")
	.then().log().all();
}
@Test
public void pojoPostRequest() {
	category cp=new category(5, "asdf");
	
	String[] url= {"http://cat.com","http://dog.com"};
	//List<String> s=new ArrayList<String>();
	//s.add("http://cat.com");
	//s.add("http://dog.com");
	tags t1=new tags(4, "cat");
	tags t2=new tags(6,"dog");
	tags[] t= {t1,t2};
	JavaUtility ju=new JavaUtility();
	pojoClass pc=new pojoClass(ju.randomNo(), cp, "dog", url, t, "in stock");
	Response resp= given().body(pc).contentType(ContentType.JSON)
	.when().post("https://petstore.swagger.io/v2/pet");
	 int id = resp.jsonPath().get("id");
	resp.then().log().all();
	

Response resp2=when().get("https://petstore.swagger.io/v2/pet/"+id);
String name=resp2.jsonPath().get("category.name");

resp.then().contentType(ContentType.JSON).log().all();
System.out.println(name);

category cp1=new category(8, name);
cp1.setName("sheep");
pojoClass pc1=new pojoClass(1, cp1, "dog", url, t, "in stock");
given().body(pc1).contentType(ContentType.JSON)
.when().post("https://petstore.swagger.io/v2/pet")
.then().log().all();
	}
}
