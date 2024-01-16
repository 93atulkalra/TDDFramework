package basePage;

import org.openqa.selenium.WebDriver;

import baseExecution.BaseFrontEnd;

public class BaseWebApp {
	
	protected WebDriver driver;
	
	public BaseWebApp()
	{
		super();
		this.driver=BaseFrontEnd.getDriver();
	}
	
	

}
