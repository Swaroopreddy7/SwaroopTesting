package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		//to maximise the browsser
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		//click on oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//select passenger value from dropdown
		Select p=new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		Select p1=new Select(driver.findElement(By.name("fromPort")));
		p1.selectByVisibleText("London");
		Select p2=new Select(driver.findElement(By.name("fromMonth")));
		p2.selectByVisibleText("July");
		Select p3=new Select(driver.findElement(By.name("fromDay")));
		p3.selectByIndex(22);
		Select p4=new Select(driver.findElement(By.name("toPort")));
		p4.selectByVisibleText("New York");
		Select p5=new Select(driver.findElement(By.name("toMonth")));
		p5.selectByVisibleText("July");
		Select p6=new Select(driver.findElement(By.name("toDay")));
		p6.selectByIndex(28);
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select p7=new Select(driver.findElement(By.name("airline")));
		p7.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
	}

}
