package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _003_1_BrowserCommands {

	public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://www.guru99.com");
	System.out.println("Page Title :-"+ss.getTitle());
	System.out.println("Page CurrentUrl :-"+ss.getCurrentUrl());
	System.out.println("PageSource :-"+ss.getPageSource());

	ss.close();

	}

}
