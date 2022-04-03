package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

	public WebDriver driver;

	public GoogleHomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	
	By searchBox = By.name("q");
	By firstElement = By.xpath("//div[@class='tF2Cxc']/div[1]/a");
	
	
	public WebElement search() {
		
		return driver.findElement(searchBox);
	}
	
	
	public LandingPage clickFirstElement() {
		driver.findElement(firstElement).click();
		//return driver.findElement(firstElement);
		return new LandingPage(driver);
		 
	}

}
