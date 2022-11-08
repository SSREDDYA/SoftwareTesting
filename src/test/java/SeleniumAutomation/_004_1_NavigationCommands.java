package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _004_1_NavigationCommands {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://www.guru99.com");
	Thread.sleep(3000);
	//navigationCommands
	ss.navigate().to("https://onlinetestinghelp.com/backup/loan");   
	Thread.sleep(3000);
	    
	 	System.out.println("Page Title2 :-"+ss.getTitle());
	 	Thread.sleep(3000);
	 	String url2=ss.getCurrentUrl();
	 	System.out.println("Page URL2 :-"+ss.getCurrentUrl());
	 	Thread.sleep(3000);
	     ss.navigate().back();
	     Thread.sleep(3000);
	     ss.navigate().forward();
	     Thread.sleep(3000);
	     ss.navigate().refresh();;
	     Thread.sleep(3000);
	     
	   
	     
	ss.quit();
	
	
	
	
	
	
	}

}
