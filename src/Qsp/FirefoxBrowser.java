package Qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumKCMS8\\AutomationProject\\Drivers\\geckodriver.exe");
		
		new FirefoxDriver().close();
		
	
	}

}
