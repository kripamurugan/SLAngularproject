package in.redbus.testpages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import in.redbus.base.TestBase;
import in.redbus.pages.SearchBusPage;

public class BookBusTicketTest extends TestBase {
	 SearchBusPage Sp;
	 @BeforeClass
	public void OpenApp() {
		openBrowser("Chrome");
		Sp = new SearchBusPage(driver);
	}
	@Test
	public void SearchBus() throws InterruptedException {
		String from = "Trivandrum";
		String to = "Chennai";
		
		Sp.clickFrom(from);
		Sp.clickTo(to);
		Sp.clickDate();
		Sp.selectDateFromCalendar();
		Sp.searchBuses();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void CloseApp() {

		driver.quit();
	}
}

