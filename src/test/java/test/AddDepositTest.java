package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BrowserFactory.BrowserFactory;
import page.LoginPage;

public class AddDepositTest {
	@Test
	public void validateDeposits() {
	//Starts the browser and saves the driver in the test class
	WebDriver driver = BrowserFactory.startBrowser(null);
	//Take you to the site
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	//Calling LoginPage Class or Activate
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	//calling the method inside LoginPage
	loginPage.login("techfiosdemo@gmail.com", "abc123");
	//Activate the DashboardPage
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	//call methods inside Dashboard Page
	dashboardPage.waitForPage();

	//Step: click on the add deposit button
	dashboardPage.clickOnAddDepositButton();
	//Activate Add Deposit Page
	AddDepositPage addDepositPage = PageFactory.initElements(driver, AddDepositPage.class);
	//Call the fill in the form method
	String description = "Lunch Money";
	addDepositPage.fillInTheAddDepositForm(description, "50");
	//addDepositPage.waitForSuccessMsg();
	driver.close();
	driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
}
