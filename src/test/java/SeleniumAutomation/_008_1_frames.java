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

public class _008_1_frames {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	ChromeDriver ss= new ChromeDriver();
	
	ss.manage().window().maximize();
	
	ss.get("https://jqueryui.com/selectable/");

	
	ss.switchTo().frame(ss.findElement(By.xpath("//iframe[@class='demo-frame']")))	;

  WebElement hold=	ss.findElement(By.xpath(" //li[text()='Item 1']"));
 WebElement rel=	ss.findElement(By.xpath(" //li[text()='Item 5']"));

 
 Actions act= new Actions(ss);
 act.dragAndDrop(hold,rel).build() .perform();

 Thread.sleep(4000);

 ss.quit();
	
 
	
	}

}
