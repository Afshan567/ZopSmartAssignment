package zposmrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.EndPointsLibrary;
import GenericUtility.Fileutil;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

import pojoPackage.pojoReqres;

public class createProject extends BaseClass {
@Test
public void postRequest() throws Throwable {
	Fileutil ful = new Fileutil();
	String name=ful.getData("name");
	String job = ful.getData("job");
	pojoReqres pr = new pojoReqres(name, job);
	
	Response resp=given().spec(req).body(pr)
	.when().post(EndPointsLibrary.createProject);
resp.then().assertThat().spec(res).statusCode(201).log().all();
}
@Test
public void getSingleUser() {
	
	given().spec(req)
	.when().get(EndPointsLibrary.getSingleUser)
	.then().assertThat().spec(res).statusCode(200).log().all();
}
@Test
public void reqChaining() {
	int expId=7;
	String exp="application/xml";
	Response res=when().get("https://reqres.in/api/users?page=2");
			int actId=res.jsonPath().get("data[2].id");
			//Assert.assertEquals(actId, expId);
			//System.out.println("matching");
			Response res2=given().pathParam("iid", actId)
			.when().get("https://reqres.in/api/users/{iid}");
			//res2.then().log().all();
			System.out.println(res2.getHeaders());
			String act=res2.getHeader("Content-Type");
			Assert.assertEquals(exp, act);
}
@Test
public void dynamicValidation() {
	int expId=7;
	boolean flag=false;
	Response res=when().get("https://reqres.in/api/users?page=1");
	Response resp = when().get("https://reqres.in/api/users?page=2");
	List<Integer> actId=res.jsonPath().get("data.id");
	for(Integer i:actId)
	{
	System.out.println(i);
	}
		/*if(i.equals(expId))
			{
			flag=true;
			break;
		}
	}
	Assert.assertTrue(flag);
	System.out.println("pass");*/
	List<Integer> id = resp.jsonPath().get("data.id");
	for (Integer inte : id) {
		System.out.println(inte);
	}
}
}