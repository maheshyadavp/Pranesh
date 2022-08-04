package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumKCMS8\\AutomationProject\\Drivers\\chromedriver.exe" );
		System.out.println("My New Prtoject");
		new ChromeDriver().close();
	}

}
