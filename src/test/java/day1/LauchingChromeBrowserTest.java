package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchingChromeBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		//enter username as swaroop reddy
		driver.findElement(By.name("email")).sendKeys("Swaroop reddy");
		//enter password as reddy123
		driver.findElement(By.name("password")).sendKeys("reddy123");
		//enter confirm password as reddy123
		driver.findElement(By.name("confirmPassword")).sendKeys("reddy123");
		//button element
		//click on submit
		driver.findElement(By.name("submit")).click();
		//close browser
		driver.close();
	}

}
