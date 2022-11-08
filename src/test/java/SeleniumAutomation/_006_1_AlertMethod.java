package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _006_1_AlertMethod {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://the-internet.herokuapp.com/javascript_alerts");
		  
	ss.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Thread.sleep(1000);
	System.out.println("1="+ss.switchTo().alert().getText());
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Thread.sleep(1000);
	System.out.println("11 ="+ss.switchTo().alert().getText());
	ss.switchTo().alert().accept();
	Thread.sleep(1000);
	ss.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().dismiss();
	
	ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(1000);
	
	ss.switchTo().alert().sendKeys("sivasankar");
	Thread.sleep(2000);
	System.out.println("2="+ss.switchTo().alert().getText());
	Thread.sleep(1000);
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().dismiss();
	Thread.sleep(1000);
	ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(1000);
	System.out.println("3="+ss.switchTo().alert().getText());
	Thread.sleep(1000);
   
	ss.quit();
	
	
	//p[@id='result']
	
	
	
	}

}
