package SeleniumTESTNGAutomationTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _4_dataProvider {
	
	WebDriver driver;

	@BeforeClass

	public void browserlanch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	@Test(dataProvider = "testdata")
	public void LoginTest(String UN ,String PWD) throws InterruptedException {

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(UN);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(PWD);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
        
		
	}

	@DataProvider(name="testdata")
	public Object[][] testdata()
	{
		Object [][] data= new Object[4][2];
		
		data[0][0]="963852.s@gmail.com";
		
		data[0][1]="ssreddy.@321";
		
		
        data[1][0]="sankara";
		
		data[1][1]="rama@124";
	
		
	    data[2][0]="sankara";
			
		data[2][1]="rama@124";
			
			
		 data[3][0]="sankara";
			
		 data[3][1]="rama@124";
				
		return data;
		
	}
	
	
	
	
	@AfterClass

	public void BrowserClose() {
		driver.close();
	}
	

}
