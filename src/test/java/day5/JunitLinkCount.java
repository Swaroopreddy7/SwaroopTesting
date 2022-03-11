package day5;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitLinkCount {
	WebDriver driver;
		@Test
		public void Testcase1() {
			//to count the links
		      List<WebElement> linkNames=driver.findElements(By.tagName("a"));
		      System.out.println("The number of links is:"+linkNames.size());
		}		      
		@Before
		public void before() {
			System.out.println("Pre-requisite");
			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.navigate().to("http://demowebshop.tricentis.com/");
	}
		@After
		public void after() {
			System.out.println("Post-Condition");
			driver.close();
		}
}
