package GenericUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	public RequestSpecification req;
	public ResponseSpecification res;
	public Fileutil fl=new Fileutil();
	public WebDriver driver;
	//public static WebDriver sdriver;
	public WebdriverUtil wdu=new WebdriverUtil();
	
@BeforeSuite
public void ReqAndResBuilder()
{
	//System.out.println("db connnected");
	req=new RequestSpecBuilder().setBaseUri("https://reqres.in")
			.setContentType(ContentType.JSON).build();
	res=new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
}
@BeforeClass
public void launchBrowser() throws Throwable {
	String Browser=fl.getData("browser");
	if(Browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else {
		System.out.println("invalid browser");
	}
	//sdriver=driver;
	wdu.maximTheBrowsr(driver);
}
@BeforeMethod
public void openApplc() throws Throwable {
	
	String URL=fl.getData("url");
driver.get(URL);	
wdu.implictWait(driver, 10);
}
@AfterMethod
public void am() {
	System.out.println("sign out from app");
}
@AfterClass
public void ac() {
driver.quit();
}
@AfterSuite
public void as() {
	System.out.println("db closed");
}
}
