package SeleniumAutomation;

import java.awt.Window;
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

public class _009_1_ScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ss = new ChromeDriver();

		ss.manage().window().maximize();

	ss.get("https://www.google.co.in/maps/@14.7120687,78.7718485,75m/data=!3m1!1e3?hl=en");
		ss.manage().window().maximize();
		//ss.get("https://netbanking.hdfcbank.com/netbanking/");
		
		Thread.sleep(2000);
		File tss1 = ((TakesScreenshot) ss).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(tss1, new File("\\src\\test\\java\\SreenShorts.png"));
		FileUtils.copyFile(tss1, new File("C:\\ssreddy\\p\\src\\test\\java\\SreenShorts\\demo.png"));
		
		Thread.sleep(4000);
		ss.quit();
		
		
			 

	}
}
