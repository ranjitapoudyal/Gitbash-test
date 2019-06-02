package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;// Globel

	public LoginPage() {
		this.driver = driver;

	}

//every page must have a constructor to invite the driver	
//Element Library

	@FindBy(how=How.ID, using = "username")
	WebElement Email;

	@FindBy(how=How.ID, using = "password")
	WebElement Password;

	@FindBy(how=How.NAME, using = "login")
	WebElement SignIn;

	public void login(String userName, String password) {
//methods to interact with the elements(By.sff;hh;gf)
		Email.sendKeys("techfiosdemo@gmail.com");
		Password.sendKeys("abc123");
		SignIn.click();

	}

//methods to interact with the elements

}
