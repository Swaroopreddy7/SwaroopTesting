package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		//get window ID
		String oldpage=driver.getWindowHandle();
		System.out.println(" currently opened page window Id is : " +oldpage);
		//click on click  here
		driver.findElement(By.linkText("Click Here")).click();
		//Switch from old window to new windoe
		//to get the window ID of newly opened table use below syntax
		Set<String> newpage =driver .getWindowHandles();
		for(String name:newpage) {
			driver.switchTo().window(name);
			System.out.println("window Id of newly opened tab is: +name");
		}
		//enter email id 
		driver.findElement(By.name("emailid")).sendKeys("sai@gmail.com");
		//click on submit
		driver.findElement(By.name("btnLogin")).click();
		//switch from new page to oldpage
		driver.switchTo().window(oldpage);
		//driver.close()--> close only active tab
		driver.quit(); //forces to close all the tab opened in browser	
		}	
	}
