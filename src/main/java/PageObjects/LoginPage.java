package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#login1")
	private WebElement uname;
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement pswd;
	
	@FindBy(css="input[value='Sign in']")
	private WebElement submit;
	
	@FindBy(css=".div_login_error b")
	private WebElement txt;
	
	@FindBy(xpath="//a[@title='Create new Rediffmail account']")
	private WebElement nwAcntTxt;
	
	
	public WebElement username() {
		
		return uname;
	}

	
	public WebElement password() {
		
		return pswd;
	}
	
	
	public WebElement submit() {
		
		return submit;
	}
	
	public WebElement text() {
		
		
		return txt;
	}
	
	public WebElement newAccountText() {
		
		return nwAcntTxt;
	}
}
