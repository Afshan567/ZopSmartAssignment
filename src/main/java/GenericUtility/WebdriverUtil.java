package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtil {

	public void maximTheBrowsr(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implictWait(WebDriver driver,int dur)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(dur));
	}
	public void rndomscroll(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)", "");
	}
	public void customwait(long a) throws InterruptedException {
		Thread.sleep(a);
	}
public void select(WebElement ele,String text)
{
	Select se=new Select(ele);
	se.selectByVisibleText(text);
}
}
