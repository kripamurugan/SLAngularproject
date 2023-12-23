package com.app.medicare.testing;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.medicare.base.Base;
import com.app.medicare.locators.Test_pagelocator;


public class TestMedicare extends Base {

	Test_pagelocator hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new Test_pagelocator(driver);
	}

	@Test(priority = '1')
	public void Registration_Page() throws InterruptedException {

		Thread.sleep(2000);
		hp.EnterEmail();;
		Thread.sleep(2000);
		hp.EnterPassword();;
		Thread.sleep(2000);
		hp.clickOnLogin();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
		Thread.sleep(2000);
		
	}
	@Test(priority = '2')
	public void AddToCart_Page() throws InterruptedException{
		hp.clickOnAddToCart();
		Thread.sleep(2000);
		hp.Home();
		Thread.sleep(2000);
		hp.ClickOnCart();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6500)");
		Thread.sleep(5000);
	}
	@Test(priority = '3')
	public void PlaceOrder_Page() throws InterruptedException{
		hp.ClickOnPlaceOrder();
		Thread.sleep(2000);
		hp.Home();
		Thread.sleep(1000);
	}
	@Test(priority = '4')
	public void SearchProduct_Page() throws InterruptedException{
		hp.ClickOnSearch();
		hp.ClickOnSearchButton();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
		//Thread.sleep(1000);
		hp.Home();
		
	}
	
	@Test(priority = '5')
	public void Filter_Page() throws InterruptedException{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
		Thread.sleep(4000);
		hp.ClickOnFilter();
		Thread.sleep(2000);
	
		
	}
	
	  @AfterClass public void CloseApp() {
		  driver.quit();
		  }
	 
}