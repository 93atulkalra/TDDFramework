package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import baseExecution.baseFrontEnd;
import basePage.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends baseFrontEnd {

	
	@Test
	public void launchWebPage() {
		
		
		// Navigate to the demoqa website
	
		loginPage lp = new loginPage();
		lp.clickLogin();
		

	}
}
