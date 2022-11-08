package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _002_1_BrowserFullscreen {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().fullscreen();
	Thread.sleep(3000);
	ss.manage().window().maximize();
	
	}

}
