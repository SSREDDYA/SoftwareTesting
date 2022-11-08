package SeleniumAutomation;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _005_3_Dropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		ss.manage().window().maximize();
		
		ss.get(" https://register.rediff.com/register/register.php?");
		
	
		
		
		
		
		
		
		
		
		
		String title =driver.getTitle();
		System.out.println("Page title is-------:-"+title);
		String url =driver.getCurrentUrl();
		System.out.println("Page CurrentUrl is-------:-"+url);
		
		driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("ss reddy");
		
		driver.findElement(By.xpath("//input[@maxlength='30']")).sendKeys("ssreddy3214");
		
		
		driver.findElement(By.className("btn_checkavail")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement siva=driver.findElement(By.xpath("//input[@maxlength='14']"));
		
		
		
		siva.sendKeys("Ssreddy321");
		String sankar=siva.getAttribute("maxlength");
		
		int size = sankar.length();
		if(size<=14)
		{
			
			System.out.println("PASSWORD LENGTH IS ALLOWED");
			
		}
		else
		{
			System.out.println("PASSWORD LENGTH IS NOT ALLOWED");
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Ssreddy321");
		driver.findElement(By.xpath("//input[@maxlength='100']")).sendKeys("ssreddy3214@gmail.com");
		
		
		driver.findElement(By.xpath("//img[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		
		List<WebElement> ram=driver.findElements(By.tagName("li"));
		
		System.out.println("number of the tag is----:-"+ram.size());
		
		for(int i=1;i<ram.size();i++)
		{
			String ch=ram.get(i).getText();
			System.out.println(ch);
			
			if(ch.contains("Australia"))
				
			{
				System.out.println(ch);
				ram.get(i).click();
				
				
			}
			
			
		}
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9857462310");
		
		boolean gender = driver.findElement(By.xpath("//input[@value='m']")).isEnabled();
		System.out.println("genger male is-----:-"+gender);
		
		WebElement genderm=driver.findElement(By.xpath("//input[@value='m']"));
		
		WebElement genderf=driver.findElement(By.xpath("//input[@value='m']"));
		
		if(genderm.equals("m"))
		{
			System.out.println("Selected gender is----:-"+genderm.getAttribute("value"));
						
		}
		else
		{
			System.out.println("Selected gender is----:-"+genderf.getAttribute("value"));
		}
		
		genderm.click();
		
		WebElement cnty=driver.findElement(By.xpath("//select[@id='country']"));
		Select country = new Select(cnty);
		System.out.println(country.getFirstSelectedOption().getText());
		boolean options = country.isMultiple();
		System.out.println("Multiple options are"+options);
		List<WebElement> countrynames=country.getOptions();
		
		int tcn=countrynames.size();
		System.out.println("num of countrynames are--:-"+tcn);
			for(int i=0;i<tcn;i++)
		{
			
			String cn=countrynames.get(i).getText();
			System.out.println();
		}
		country.selectByVisibleText("Togo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		country.selectByVisibleText("India");
	
			WebElement da=driver.findElement(By.name("DOB_Dayd88867c0"));
		Select day= new Select(da);
		day.selectByValue("17");
		WebElement mo=driver.findElement(By.xpath("//select[contains(@name,'Dom_Month')]"));
		Select mon= new Select(mo);
		mon.selectByValue("12");
		WebElement ye=driver.findElement(By.xpath("//select[contains(@name,'Dom_Year')]"));
		Select year= new Select(ye);
		year.selectByValue("1997");
		
		driver.findElement(By.id("Register")).submit();
		
			
		driver.quit();

		

	}

}
