package in.redbus.testpages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import in.redbus.pages.HomePage;
import in.redbus.base.TestBase;

public class AccountPageTest extends TestBase {

	HomePage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new HomePage(driver);
	}

	@Test
	public void clickOnSignUpPage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(5000);
		hp.clickOnSignup();
		Thread.sleep(5000);
		

	}



	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}
