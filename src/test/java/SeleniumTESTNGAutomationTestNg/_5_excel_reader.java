package SeleniumTESTNGAutomationTestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_excel_reader {
	
	WebDriver driver;

	@BeforeClass

	public void browserlanch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	
	@Test
	public void LoginTest() throws IOException, InterruptedException  {
		
FileInputStream fAX= new FileInputStream("C:\\Users\\SSReddy\\Downloads\\Book.xlsx");
		
		
		XSSFWorkbook wb= new XSSFWorkbook("fAX");
	XSSFSheet sheet=wb.getSheet("Sheet1");
	 String UN=   sheet.getRow(1).getCell(0).getStringCellValue();
	 
	 System.out.println("-----UN-----" +UN);
	
	 
	 double PWD_int= sheet.getRow(1).getCell(1).getNumericCellValue();
	 
	 String PWD_str = String.valueOf(PWD_int);
	 System.out.println(PWD_str);    // 2344
	 
	 System.out.println("-----PWD-----" +PWD_str);
		

		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PWD_str);
		
		
	}

	
	
	
	
	@AfterClass

	public void BrowserClose() {
		driver.close();
	}
	

}
