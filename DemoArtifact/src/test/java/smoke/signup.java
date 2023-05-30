package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import baseExecution.baseFrontEnd;
import basePage.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class signup extends baseFrontEnd {

	
	@Test
	public void launchSignupPage() {
		
		
		// Navigate to the demoqa website
	
		loginPage lp = new loginPage();
		lp.clickSignup();
		

	}
}
