package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open application
				driver.get("http://demowebshop.tricentis.com/");
				//click on Register
				driver.findElement(By.linkText("Register")).click();
				//click on gender
				driver.findElement(By.id("gender-male")).click();
				//enter first name
				driver.findElement(By.name("FirstName")).sendKeys("Swaroop reddy");
				//enter last name
				driver.findElement(By.name("LastName")).sendKeys("Chappidi");
				//enter email
				driver.findElement(By.name("Email")).sendKeys("nanireddy2207@gmail.com");
				//enter password
				driver.findElement(By.name("Password")).sendKeys("reddy123");
				//enter confirm password
				driver.findElement(By.name("ConfirmPassword")).sendKeys("reddy123");
				//click on register
				driver.findElement(By.name("register-button")).click();
				//close browser
				driver.close();
	}

}
