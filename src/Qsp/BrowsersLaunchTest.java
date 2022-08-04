package Qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersLaunchTest {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.out.println("Enter Browser Name");
		Scanner sc = new Scanner(System.in);
		          String browserName = sc.next();
		
	if(browserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");	
	
		
		driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");	
		
		driver = new FirefoxDriver();
	}
	//else(browserName.equalsIgnoreCase("Please enter Browser name")){

	//}
		driver.close();
	
	
	}

}
