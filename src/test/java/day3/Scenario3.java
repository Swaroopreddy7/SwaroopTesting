package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//to maximise the browsser
		driver.manage().window().maximize();		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target=driver.findElement(By.id("amt7"));
		act.clickAndHold(src).release(target).build().perform();
		WebElement rr=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]/a"));
		WebElement sr=driver.findElement(By.id("bank"));
		act.clickAndHold(rr).release(sr).build().perform();
		WebElement ar=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[6]/a"));
		WebElement br=driver.findElement(By.id("loan"));
		act.clickAndHold(ar).release(br).build().perform();
		WebElement cr=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]/a"));
		WebElement dr=driver.findElement(By.id("amt8"));
		act.clickAndHold(cr).release(dr).build().perform();
		
	}
}
