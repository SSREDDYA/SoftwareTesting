package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _001_BrowserOpen {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chrome.driver", "C:\\ssreddy\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	
	
	}

}
