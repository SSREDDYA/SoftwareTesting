package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _004_2_NavigationCommands {

	public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://www.guru99.com");
	
	String title=ss.getTitle();
	System.out.println("Page Title :-"+title);
	String url=ss.getCurrentUrl();
	System.out.println("Page URL :-"+url);
	   
	                      
	ss.quit();
	
	
	
	
	
	
	}

}
