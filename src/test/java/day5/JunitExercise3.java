package day5;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise3 {
		WebDriver driver;
		@Test
		public void Testcase1() {
			//verify whether Register link and Log in link is available on home page
			WebElement registerlink=driver.findElement(By.linkText("Register"));
			WebElement loginlink=driver.findElement(By.linkText("Log in"));
			assertTrue(registerlink.isDisplayed());
			assertTrue(loginlink.isDisplayed());
		}
		@Test
		public void Testcase2() {
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("Chappidiii@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("reddy123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//Check whether login is success	
			String emailtext=driver.findElement(By.linkText("Chappidiii@gmail.com")).getText();
			assertTrue(emailtext.contains("Chappidiii@gmail.com"));
			assertEquals("Chappidiii@gmail.com",emailtext);
			assertTrue(driver.findElement(By.linkText("Chappidiii@gmail.com")).isEnabled());
		}
		@Before
		public void Before(){
			System.out.println("Pre-requisite");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//open application
			driver.get("http://demowebshop.tricentis.com/");
		}
		@After
		public void After(){
			System.out.println("Post-Condition");
			driver.close();
		}

}
