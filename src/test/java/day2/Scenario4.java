package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("nanireddy2207@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("reddy123");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Build your own cheap computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.name("product_attribute_72_5_18")).click();
		driver.findElement(By.name("product_attribute_72_6_19")).click();
		driver.findElement(By.name("product_attribute_72_3_20")).click();
		driver.findElement(By.name("product_attribute_72_8_30")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
	}

}
