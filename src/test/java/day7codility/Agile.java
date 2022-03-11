package day7codility;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Agile {
	static WebDriver driver;
	@Test
	public void TC1() {
		//driver.findElement(By.name("uid")).sendKeys("");
		//driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("btnLogin")).click();
		//check if alert appears with the text "User or Password is not valid"
		driver.switchTo().alert().accept();
	}
	@Test
	public void TC2() {
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("3309");
		driver.findElement(By.name("AccSubmit")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
	}
	//@Test
	public void TC3() {
		driver.findElement(By.xpath("/html/body/div[4]/ol/li[1]"));
		driver.findElement(By.xpath("/html/body/div[4]/ol/li[2]"));
	}
	@BeforeClass
	public static void Before(){
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open application
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	}
	@After
	public void After(){
		System.out.println("Post-Condition");
		driver.close();
	}
}
