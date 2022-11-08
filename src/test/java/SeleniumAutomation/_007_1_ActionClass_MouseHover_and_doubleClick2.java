package SeleniumAutomation;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _007_1_ActionClass_MouseHover_and_doubleClick2 {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://www.globalsqa.com/demo-site/");
	ss.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	; 
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)ss;
	js.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(2000);
 WebElement Mh=	ss.findElement(By.xpath("//a[normalize-space()='Tabs']"));  
             Actions act= new Actions(ss);
             
    //MouseHover and double Click      
 act.moveToElement(Mh).pause(200).doubleClick(Mh).build().perform();
 System.out.println("completed");
 
 Thread.sleep(2000);
 /*
 WebElement MOUSE2=	ss.findElement(By.xpath("///a[normalize-space()='SME Traveller']"));
 

 
 act.moveToElement(MOUSE2).doubleClick() .build() .perform();
 */
 ss.quit();
	
	
	}

}
