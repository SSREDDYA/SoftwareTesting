package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _005_3_CheckBoxes_radioButtons {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver ss = new ChromeDriver();

		ss.manage().window().maximize();

		ss.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(3000);
		Select sel = new Select(ss.findElement(By.xpath("(//select)[1]")));
		sel.selectByIndex(5);
		Thread.sleep(3000);
		sel.selectByValue("BRA");

		Thread.sleep(3000);
		sel.selectByVisibleText("India");
		Thread.sleep(3000);

		ss.quit();

	}

}
