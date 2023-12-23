package com.app.medicare.locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_pagelocator {

	

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement Email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement login;

	@FindBy(id = "cart102")
	WebElement AddToCart;
	
	@FindBy(linkText = "Home") 
	WebElement Home;
	
	@FindBy(linkText = "Cart") 
	WebElement Cart;
	 
	@FindBy(linkText = "Place Order") 
	WebElement PlaceOrder;
	
	@FindBy(id = "search-product")
	WebElement Search;
	
	@FindBy(id = "filter-button")
	WebElement Filter;
	
	@FindBy(id = "search-product-button")
	WebElement SearchButton;
	
	public Test_pagelocator(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public void EnterEmail() {

		Email.click();
		Email.sendKeys("medicare123@gmail.com");
	}

	public void EnterPassword() {

		password.click();
		password.sendKeys("123456");;

	}

	public void clickOnLogin() {

		login.click();
	}

	public void clickOnAddToCart() {

		AddToCart.click();
	}
	
	public void Home() {

		Home.click();
	}
	
	public void ClickOnCart() {

		Cart.click();
	}
	
	public void ClickOnPlaceOrder() {

		PlaceOrder.click();
	}
	
	public void ClickOnFilter() {
		System.out.println("Filter");
		Filter.click();
	}
	

	  public void ClickOnSearch() {
	  
	  Search.click();
	  Search.sendKeys("AnyProduct");
	  }
	  
	  public void ClickOnSearchButton() {

			SearchButton.click();
		}
	 

}
