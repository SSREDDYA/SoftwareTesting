package SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _011_2_fileUpload_robotClass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ss = new ChromeDriver();

		ss.manage().window().maximize();

		 ss.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	      ss.get("http://my.monsterindia.com/create_account.html");
	      // scroll to reach upload button
	      JavascriptExecutor j = (JavascriptExecutor)ss;
	      j.executeScript("scrollBy(0,100)");
	      // file path passed as parameter to StringSelection
	      StringSelection s = new StringSelection("C:\\Users\\SSReddy\\Downloads\\Shiva.docx.txt");
	      // Clipboard copy
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      //identify element and click
	      ss.findElement(By.xpath("//*[text()='Choose file']")).click();
	      // Robot object creation
	      Robot r = new Robot();
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	 
	      ss.quit();
	}
}
