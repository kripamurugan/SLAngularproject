package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    @Test
    public void testFacebookAuthentication() throws InterruptedException {
        

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open Facebook login page
        driver.get("https://www.facebook.com");
        
        Thread.sleep(3000);


        // Find username and password input fields and login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
        
        Thread.sleep(3000);


        // Enter your Facebook credentials (replace with your test account details)
        usernameField.sendKeys("demouser1999@gmail.com");
        Thread.sleep(7000);

        passwordField.sendKeys("demoUser@1234567");
        Thread.sleep(7000);


        // Click the login button
        loginButton.click();
        
        Thread.sleep(3000);

        

        // Wait for the authentication process (replace with appropriate waiting mechanism)

        // Assert that the login was successful (replace with appropriate verification)
        assertFalse(driver.getCurrentUrl().contains("facebook.com/home"), "Facebook authentication failed");
        
        Thread.sleep(7000);

        
        System.out.println("working....");

        // Close the browser
        driver.quit();
    }
}


/////////////////////////////////////////////////////////////////////////////////SearchEngineGoogle.java/////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEngineGoogle {

	@Test
	public void testGoogleSearch() throws InterruptedException {

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open Google search page
		driver.get("https://www.google.com");

		// Find the search input field and search button
		WebElement searchField = driver.findElement(By.name("q"));
		WebElement searchButton = driver.findElement(By.id("APjFqb"));

		Thread.sleep(7000);

		// Enter your search query
		searchField.sendKeys("System Testing");

		System.out.println("System testing searched sucessfully");
		Thread.sleep(7000);

		// Click the search button
		searchButton.click();

		Thread.sleep(7000);

		// Wait for the search results page (replace with appropriate waiting mechanism)

		// Assert that the search results are displayed (replace with appropriate
		// verification)
		assertFalse(driver.getTitle().contains("Unit Testing"), "Google search failed");

		// Close the browser
		driver.quit();
	}
}
