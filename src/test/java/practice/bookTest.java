package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.HomePage;

 
public class bookTest extends BaseClass{
	@Test
	public void bT() throws Throwable {
		
		
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.booking.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,150)", "");	
		wdu.rndomscroll(driver);
		//Thread.sleep(2000);
		wdu.customwait(2000);
		
				/*while(true)
		{
		try {
		driver.findElement(By.xpath("//input[@name='ss']")).click();
		
		break;
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']")).click();
			}
		
	}
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='ce5ee7d913']/div[text()='Bangalore']")).click();
								
				
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='November']/ancestor::div[@class='d358556c65']/descendant::span[text()='11']")).click();
		driver.findElement(By.xpath("//h3[text()='November']/ancestor::div[@class='d358556c65']/descendant::span[text()='12']")).click();
		driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
driver.findElement(By.xpath("//label[.='Children']/ancestor::div[@class='a7a72174b8']//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']")).click();		
	
	WebElement drpDwn = driver.findElement(By.xpath("//select[@class='ebf4591c8e']"));
	Select se=new Select(drpDwn);
	se.selectByVisibleText("7 years old");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Search']")).click();*/
		HomePage hp=new HomePage(driver);
		hp.bookingtest("7 years old");
	}
}