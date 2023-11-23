package zposmrt;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.mysql.cj.result.Row;

import GenericUtility.ExcelUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

public class R1R2Assignment {
@Test
public void R1R2() throws Throwable
{
 
	JSONParser p=new JSONParser();
	Object obj1=p.parse(new FileReader("./r1.json"));
	JSONObject r1=(JSONObject)obj1;
	
	Object obj2 = p.parse(new FileReader("./r2.json"));
	JSONObject r2 = (JSONObject)obj2;
	if(r1.containsKey("email"))
	{
		System.out.println("email is present in r1 response");
		System.out.println(r1);
	}
	else if(r2.containsKey("email"))
	{
		System.out.println("email is present in r2 response");
		System.out.println(r2);
	}
	else
	{
		System.out.println("email is not present in r1 and r2");
	}
}
}

