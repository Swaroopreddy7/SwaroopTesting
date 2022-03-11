package day7codility;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
public class Google {
	static WebDriver driver;
@Test
	public void TC01() {
	    WebElement searchbox= driver.findElement(By.name("q"));
	    WebElement searchbutton=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	    assertTrue(searchbox.isDisplayed());
	    assertTrue(searchbutton.isDisplayed());
	}
@Test
public void TC02() {
	 WebElement searchbox= driver.findElement(By.name("q"));
	searchbox.sendKeys("testing");
	int list=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li")).size();
	Assert.assertTrue(list>1);
	
}
	@Test
	public void TC03()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		assertTrue(driver.getTitle().contains("Google"));
	}
	@Test
	public void TC04()
	{
		int links = driver.findElements(By.tagName("a")).size();
		assertTrue(links>0);
		}

	@Before
	public void Before(){
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open application
		driver.get("https://www.google.co.in/");
	}
	@After
	public void After(){
		System.out.println("Post-Condition");
		driver.close();
	}
}
