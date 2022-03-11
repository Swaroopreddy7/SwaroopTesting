package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		//to maximise the browser
		driver.manage().window().maximize();
		//click on Login
		driver.findElement(By.linkText("Log in")).click();
		//enter Email 
		driver.findElement(By.name("Email")).sendKeys("nanireddy2207@gmail.com");
		//Enter Password
		driver.findElement(By.name("Password")).sendKeys("reddy123");
		//click on remember if needed
		driver.findElement(By.name("RememberMe")).click();
		//click login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
