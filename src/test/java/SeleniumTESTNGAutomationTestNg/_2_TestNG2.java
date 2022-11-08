package SeleniumTESTNGAutomationTestNg;




import static org.testng.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _2_TestNG2 {
	ChromeDriver ss;

	@BeforeClass()
	public void Browser() {

		WebDriverManager.chromedriver().setup();
		ss = new ChromeDriver();
		ss.manage().window().maximize();

	}

	@Test(priority = 1 , alwaysRun = false)
	public void bc1() {
		System.out.println("test 1" );
		ss.get("https://www.guru99.com");
		System.out.println("Page Title :-"+ss.getTitle());
		System.out.println("Page CurrentUrl :-"+ss.getCurrentUrl());
		//System.out.println("PageSource :-"+ss.getPageSource());

		
	}

	@Test(priority = 2, alwaysRun = false)
	public void nc() {
		System.out.println("test 2" );

		ss.get("https://www.guru99.com");

		// navigationCommands
		ss.navigate().to("https://onlinetestinghelp.com/backup/loan");

		System.out.println("Page Title2 :-" + ss.getTitle());

		String url2 = ss.getCurrentUrl();
		System.out.println("Page URL2 :-" + ss.getCurrentUrl());

		ss.navigate().back();

		ss.navigate().forward();

		ss.navigate().refresh();
		
	}

	@Test(priority = 3,alwaysRun = false)
	public void wc() {
		System.out.println("test 3" );
		ss.get("https://jqueryui.com/selectable/");

		
		ss.switchTo().frame(ss.findElement(By.xpath("//iframe[@class='demo-frame']")))	;

	  WebElement hold=	ss.findElement(By.xpath(" //li[text()='Item 1']"));
	 WebElement rel=	ss.findElement(By.xpath(" //li[text()='Item 5']"));

	 
	 Actions act= new Actions(ss);
	 act.dragAndDrop(hold,rel).build() .perform();
	}

	@Test(priority = 4,alwaysRun = false)
	public void cbrb() {
		System.out.println("test 4" );
		ss.get("https://the-internet.herokuapp.com/checkboxes");
		System.out.println(ss.findElement(By.xpath("//input[1]")).isDisplayed());
		System.out.println(ss.findElement(By.xpath("//input[1]")).isEnabled());
		System.out.println(ss.findElement(By.xpath("//input[1]")).isSelected());
		System.out.println(ss.findElement(By.xpath("//input[2]")).isEnabled());
		System.out.println(ss.findElement(By.xpath("//input[2]")).isDisplayed());
		System.out.println(ss.findElement(By.xpath("//input[2]")).isSelected());
	
	}
	

	@Test(priority = 5)
	public void dbdn() throws InterruptedException {
		System.out.println("test 5" );
		ss.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(3000);
		Select sel = new Select(ss.findElement(By.xpath("(//select)[1]")));
		sel.selectByIndex(5);
		Thread.sleep(3000);
		sel.selectByValue("BRA");

		Thread.sleep(3000);
		sel.selectByVisibleText("India");
		Thread.sleep(3000);
		
	}
	@Test(priority = 6)
	public void alert1() throws InterruptedException {
		ss.get("https://nxtgenaiacademy.com/alertandpopup/");
		System.out.println("test 6" );
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
	}
	@Test(priority = 7,alwaysRun =false )
	public void mouse() throws InterruptedException {
		 System.out.println("test 7" );
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
	}
	
	@Test(priority = 8, dependsOnMethods = "right")
	public void dd() throws InterruptedException {
		ss.get("https://jqueryui.com/droppable/");

		System.out.println("test 8" );
		ss.switchTo().frame(ss.findElement(By.xpath("//iframe[@class='demo-frame']")))	;

		 WebElement drag1=	ss.findElement(By.xpath(" //p[normalize-space()='Drag me to my target']"));

		 WebElement drop=	ss.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions act= new Actions(ss);
		 act.dragAndDrop(drag1,drop).build() .perform();

		 Thread.sleep(2000);
		ss.switchTo().defaultContent();
	}
	@Test(priority = 9 , groups="bc1")
	public void right() {
		System.out.println("test 9" );
		ss.get("https://jqueryui.com/droppable/");
 WebElement drag1=	ss.findElement(By.xpath(" //a[normalize-space()='Sortable']"));
 
		 Actions act= new Actions(ss);
		 act.contextClick(drag1).build() .perform();

	}
	

	@AfterClass()
	public void close() {
		ss.close();

	}

}
