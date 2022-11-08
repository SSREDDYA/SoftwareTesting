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

public class _007_2_ActionClass_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://jqueryui.com/droppable/");


ss.switchTo().frame(ss.findElement(By.xpath("//iframe[@class='demo-frame']")))	;

 WebElement drag1=	ss.findElement(By.xpath(" //p[normalize-space()='Drag me to my target']"));

 WebElement drop=	ss.findElement(By.xpath("//div[@id='droppable']"));
 
 Actions act= new Actions(ss);
 act.dragAndDrop(drag1,drop).build() .perform();

 Thread.sleep(4000);
ss.switchTo().defaultContent();
 ss.quit();
	
	
	}

}
