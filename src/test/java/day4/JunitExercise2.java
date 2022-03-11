package day4;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise2 {
		WebDriver driver;
		@Test
		public void Testcase1() {
			System.out.println("Testcase 1");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.name("FirstName")).sendKeys("Swaroop reddy");
			driver.findElement(By.name("LastName")).sendKeys("Chappidi");
			driver.findElement(By.id("Email")).sendKeys("Chappidiii@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("reddy123");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("reddy123");
			driver.findElement(By.name("register-button")).click(); 
			//check whether registration is success
			String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
			Assert.assertEquals("Your registration completed", actualresult);
		}
		@Test
		public void Testcase2() {
			System.out.println("Testcase 2");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("Chappidiii@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("reddy123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//Check whether login is success	
			String actualresult=driver.findElement(By.linkText("Chappidiii@gmail.com")).getText();
			Assert.assertEquals("Chappidiii@gmail.com", actualresult);
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