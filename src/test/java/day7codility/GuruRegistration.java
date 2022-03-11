package day7codility;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruRegistration {
	static WebDriver driver;
	@Test
	public void TC1() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("user_title")).sendKeys("Mr");
		driver.findElement(By.id("user_firstname")).sendKeys("Sai swaroop reddy");
		driver.findElement(By.id("user_surname")).sendKeys("Chappidi");
		driver.findElement(By.id("user_phone")).sendKeys("0123456789");
		driver.findElement(By.id("user_dateofbirth_1i")).sendKeys("1990");
		driver.findElement(By.id("user_dateofbirth_2i")).sendKeys("January");
		driver.findElement(By.id("user_dateofbirth_3i")).sendKeys("1");
		driver.findElement(By.id("licencetype_t")).click();
		driver.findElement(By.id("user_licenceperiod")).sendKeys("7");
		driver.findElement(By.id("user_occupation_id")).sendKeys("Engineer");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Krishna nagar");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Hyderabad");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Telangana");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("5000001");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("chappidi@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("reddy123");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("reddy123");
		driver.findElement(By.xpath("//input[@value='Create']")).click();
	}
	@Before
	public void Before(){
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open application
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
	}
	@After
	public void After(){
		System.out.println("Post-Condition");
		driver.close();
	}
}
