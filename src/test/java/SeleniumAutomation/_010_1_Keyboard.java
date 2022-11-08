package SeleniumAutomation;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _010_1_Keyboard {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ss = new ChromeDriver();

		ss.manage().window().maximize();

		ss.get("https://parabank.parasoft.com/parabank/register.htm");
			ss.findElement(By.name("customer.firstName")).sendKeys("SivaSankarReddyAnkireddypalle");
			Thread.sleep(2000);
			ss.findElement(By.name("customer.firstName")).sendKeys(Keys.CONTROL+"a");
			
			Thread.sleep(2000);
			ss.findElement(By.name("customer.firstName")).sendKeys(Keys.CONTROL+"c");
			Thread.sleep(2000);
			Thread.sleep(2000);
			ss.findElement(By.name("customer.lastName")).sendKeys(Keys.CONTROL+"v",Keys.TAB,Keys.CONTROL+"v", Keys.TAB,Keys.CONTROL+"v");
			
		Thread.sleep(2000);
		File tss1 = ((TakesScreenshot) ss).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(tss1, new File("\\src\\test\\java\\SreenShorts.png"));
		FileUtils.copyFile(tss1, new File("C:\\ssreddy\\p\\src\\test\\java\\SreenShorts\\demo.png"));
		
		Thread.sleep(4000);
		//ss.quit();
		
		
			 

	}
}
