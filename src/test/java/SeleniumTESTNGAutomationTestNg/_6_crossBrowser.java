package SeleniumTESTNGAutomationTestNg;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _6_crossBrowser {
	WebDriver driver;
	@Test
	//test
	@org.testng.annotations.Parameters("browser")
	public void crossbrwsrTest (String browsername) throws InterruptedException 
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		}
		
		else if(browsername.equalsIgnoreCase("Edge"))
		{
		
		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		}	
			
		

		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Test");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test123");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(300);

		driver.close();

	}
	
				
}









