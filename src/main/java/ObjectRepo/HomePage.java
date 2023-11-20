package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import GenericUtility.WebdriverUtil;

public class HomePage extends WebdriverUtil {
	@FindBy(xpath="//input[@name='ss']") private WebElement nameclk;
	@FindBy(xpath = "//button[@aria-label='Dismiss sign in information.']") private WebElement popupclk;
	@FindBy(xpath = "//div[@class='ce5ee7d913']/div[text()='Bangalore']") private WebElement blore;
	@FindBy(xpath = "//h3[text()='November']/ancestor::div[@class='d358556c65']/descendant::span[text()='11']") private WebElement frmdate;
	@FindBy(xpath = "//h3[text()='November']/ancestor::div[@class='d358556c65']/descendant::span[text()='12']") private WebElement todate;
	@FindBy(xpath = "//button[@data-testid='occupancy-config']") private WebElement btn;
	@FindBy(xpath = "//label[.='Children']/ancestor::div[@class='a7a72174b8']//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']")
	private WebElement childrn;
	@FindBy(xpath = "//select[@class='ebf4591c8e']") private WebElement slctdrpdwn;
	@FindBy(xpath = "//span[text()='Search']") private WebElement srch;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNameclk() {
		return nameclk;
	}

	public WebElement getPopupclk() {
		return popupclk;
	}

	public WebElement getBlore() {
		return blore;
	}

	public WebElement getFrmdate() {
		return frmdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getChildrn() {
		return childrn;
	}

	public WebElement getSlctdrpdwn() {
		return slctdrpdwn;
	}

	public WebElement getSrch() {
		return srch;
	}
public void bookingtest(String text) throws InterruptedException {
	while(true)
	{
	try {
		nameclk.click();
		break;
	}
	catch (Exception e) {
		popupclk.click();
		}
}
	customwait(2000);
	blore.click();
	customwait(2000);
	frmdate.click();
	todate.click();
	btn.click();
	childrn.click();
	select(slctdrpdwn, text);
	customwait(2000);
	srch.click();
}
}