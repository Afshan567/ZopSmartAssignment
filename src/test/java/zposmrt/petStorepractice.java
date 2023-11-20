package zposmrt;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoPackage.pojoClass;

import static io.restassured.RestAssured.*;

public class petStorepractice {
@Test
public void getPetDetails() {
	baseURI="https://petstore.swagger.io/v2";
when().get("/pet/findByStatus")
.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
}
@Test
public void addPet() {
String[] photurl= {"abc","def"};
int[] d= {1};
String[] nm= {"ab"};
	//CategoryPojo cp=new CategoryPojo(1, "pet1");
	//tagsPojo tp=new tagsPojo(d,nm);
	//pojoClass pc=new pojoClass(3, cp, "pet3", photurl, tp, "there");
 



}

}
