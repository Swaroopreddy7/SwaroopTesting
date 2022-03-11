package day7codility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jmeter {
	static WebDriver driver;
	@Test
	public void TC1() {
		//to count the links in jmeter
	      List<WebElement> links=driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is:"+links.size());
	}
	@Before
	public void Before(){
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open application
		driver.get("https://jmeter.apache.org/");
	}
	@After
	public void After(){
		System.out.println("Post-Condition");
		driver.close();
	}
}
