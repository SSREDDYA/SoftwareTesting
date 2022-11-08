package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsCommands {

	public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("http://sme.spicejet.com/Airline/SMERegister");
	

	System.out.println("Page Title :-"+ss.getTitle());
	System.out.println("Page URL :-"+ss.getCurrentUrl());
	
	
	
	ss.findElement(By.name("smeRegistration_OrganizationName")).sendKeys("s00215");
	WebElement ind=ss.findElement(By.name("smeRegistration.IndustrialBody"));
	Select sel=new Select(ind);
	sel.selectByIndex(0);
	sel.deselectByValue("1");
	sel.selectByVisibleText("FICCI");
	ss.findElement(By.className("form-control"));
	/*ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	ss.findElement(By.);
	
	*/
	
	
	
	
	
	
	
	                      
	ss.quit();
	
	
	
	
	
	
	}

}
