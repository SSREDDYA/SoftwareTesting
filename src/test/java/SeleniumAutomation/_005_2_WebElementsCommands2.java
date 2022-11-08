package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _005_2_WebElementsCommands2 {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://parabank.parasoft.com/parabank/register.htm");
	Thread.sleep(3000);
	/*Thread.sleep(3000);
	ss.findElement(By.name("customer.firstName")).clear();
	System.out.println("cleared");
	Thread.sleep(3000);
	ss.findElement(By.name("customer.firstName")).sendKeys("sivasankarreddy");
	
	System.out.println("getText= "+ ss.findElement(By.name("customer.firstName")).getText());
	Thread.sleep(3000);
	System.out.println("getTagName  "+ss.findElement(By.name("customer.firstName")).getTagName());
	Thread.sleep(3000);
	System.out.println("getAttribute=  "+ss.findElement(By.name("customer.firstName")).getAttribute("name"));
	Thread.sleep(3000);
	
	System.out.println("getCssValue=  "+ss.findElement(By.name("customer.firstName")).getCssValue(""));
	Thread.sleep(3000);
	System.out.println(" getLocation=  "+ss.findElement(By.name("customer.firstName")).getLocation());
	Thread.sleep(3000);
	System.out.println(" getSize=  "+ss.findElement(By.name("customer.firstName")).getSize());
	Thread.sleep(3000);
	
	
	ss.findElement(By.name("customer.lastName")).sendKeys("Ankireddypalle");
	
	ss.findElement(By.id("customer.address.street")).sendKeys("1-56,mtf,rarja");
	ss.findElement(By.id("customer.address.street")).clear();
	ss.findElement(By.id("customer.address.street")).sendKeys("1-56,mtf,rarja");
	
	
	ss.findElement(By.name("customer.address.city")).sendKeys("Hyderabad");
	ss.findElement(By.name("customer.address.state")).sendKeys("Andhrapradesh");
	ss.findElement(By.name("customer.address.zipCode")).sendKeys("500001");
	
	ss.findElement(By.id("customer.phoneNumber")).sendKeys("9548621384");
	
	ss.findElement(By.id("customer.ssn")).sendKeys("090006 12023");
	
	
	ss.findElement(By.name("customer.username")).sendKeys("ramachndra");
	
	ss.findElement(By.id("customer.password")).sendKeys("ramachndra");
	ss.findElement(By.id("repeatedPassword")).sendKeys("rama@124");
	//ss.findElement(By.className("button")).click();
	ss.findElement(By.xpath("//input[@value='Register']")).click();
	
	
*/
	ss.findElement(By.name("username")).sendKeys("ramachndra");
	

	ss.findElement(By.name("password")).sendKeys("rama@124");
	

	ss.findElement(By.xpath("//input[@value='Log In']")).click();
	             
	//ss.quit();
	
	
	
	
	
	
	}

}
