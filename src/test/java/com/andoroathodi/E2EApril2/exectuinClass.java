package com.andoroathodi.E2EApril2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.sql.Driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.GoogleHomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;

public class exectuinClass extends base {
	 public static Logger log= LogManager.getLogger(exectuinClass.class.getName());

	
 
	@BeforeTest
	public void setUp() throws Exception {

		driver = intializeDriver();
		//SoftAssert a = new SoftAssert();
		 
	}

	@Test	
	public void GoogleTest() {
	
		driver.get(prop.getProperty("url"));
		GoogleHomePage googleHome = new GoogleHomePage(driver);
		
		googleHome.search().sendKeys("rediff.com", Keys.ENTER);
		//googleHome.clickFirstElement().click();
		
        LandingPage lp = googleHome.clickFirstElement();
        
         LoginPage lop = lp.getSignIn();
         
     
	}
	
	
	@Test(dependsOnMethods= {"GoogleTest"},dataProvider="getData")
	public void  valdiateUserDetails(String username, String password){
		SoftAssert a1 = new SoftAssert();
		LoginPage lop= new LoginPage(driver);
		lop.username().clear();
		lop.username().sendKeys(username);
        lop.password().sendKeys(password);
        lop.submit().click();
        
        AssertJUnit.assertEquals(lop.text().getText(), "Temporary error occured[#5001], please try again.");
        		 System.out.println(lop.text().getText());
        	a1.assertAll();	 
	}
	
	@Test(dependsOnMethods= {"valdiateUserDetails"},alwaysRun=true)
	public void validateNewAcntText() {
		SoftAssert a2 = new SoftAssert();
		LoginPage lop = new LoginPage(driver);
		AssertJUnit.assertEquals(lop.newAccountText().getText(), "Create new account");
		System.out.println(lop.newAccountText().getText());
		 a2.assertAll();
	}

	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		data[0][0]="alex";
		data[0][1]="3434";
		data[1][0]="vijay";
		data[1][1]="gdfg";
		return data;
			
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		
		//a.assertAll();
	}
	
}
