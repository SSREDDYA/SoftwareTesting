package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _006_1__AlertMethod2 {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://nxtgenaiacademy.com/alertandpopup/");
		  
	ss.findElement(By.xpath("//button[@name='alertbox']")).click();
	Thread.sleep(1000);
	System.out.println("1="+ss.switchTo().alert().getText());
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	Thread.sleep(1000);
	System.out.println("11 ="+ss.switchTo().alert().getText());
	ss.switchTo().alert().accept();
	Thread.sleep(1000);
	ss.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().dismiss();
	
	ss.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(1000);
	//ss.switchTo().alert().clear();
	ss.switchTo().alert().sendKeys("sivasankar");
	Thread.sleep(1000);
	System.out.println("2="+ss.switchTo().alert().getText());
	Thread.sleep(1000);
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().accept();
	
	ss.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(1000);
	ss.switchTo().alert().dismiss();
	Thread.sleep(1000);
	ss.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(1000);
	System.out.println("3="+ss.switchTo().alert().getText());
	Thread.sleep(1000);
   
	ss.quit();
	
	
	
	
	
	
	}

}
