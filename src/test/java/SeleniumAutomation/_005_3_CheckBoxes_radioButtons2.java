package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _005_3_CheckBoxes_radioButtons2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ss = new ChromeDriver();

		ss.manage().window().maximize();

		ss.get("https://the-internet.herokuapp.com/checkboxes");
		ss.manage().window().maximize();
		
		System.out.println(ss.findElement(By.xpath("//input[1]")).isDisplayed());
		
		System.out.println(ss.findElement(By.xpath("//input[1]")).isEnabled());
		System.out.println(ss.findElement(By.xpath("//input[1]")).isSelected());
		
		System.out.println(ss.findElement(By.xpath("//input[2]")).isEnabled());
		System.out.println(ss.findElement(By.xpath("//input[2]")).isDisplayed());
		System.out.println(ss.findElement(By.xpath("//input[2]")).isSelected());
		

		ss.quit();

	}

}
