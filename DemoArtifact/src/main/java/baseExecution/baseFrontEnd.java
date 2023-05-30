package baseExecution;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseFrontEnd {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	@BeforeMethod()
	@Parameters("url")
	public void browserLaunchSetup(String url)
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().get(url);

	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	
	
}
