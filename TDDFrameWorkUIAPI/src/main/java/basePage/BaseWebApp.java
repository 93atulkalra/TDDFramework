package basePage;

import org.openqa.selenium.WebDriver;

import baseExecution.baseFrontEnd;

public class BaseWebApp {
	
	protected WebDriver driver;
	
	public BaseWebApp()
	{
		super();
		this.driver=baseFrontEnd.getDriver();
	}
	
	

}
