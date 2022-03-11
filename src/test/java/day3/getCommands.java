package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("Title is:"+ title);
		//check title of webpages equal to Demo Web Shop
		if(title.equals("Demo Web Shop")){
			System.out.println("Title is correct");
		}
		//fetch	current url
		System.out.println(driver.getCurrentUrl());
		//fetch html source of page
		System.out.println(driver.getPageSource());
		//move back
		driver.navigate().back();
		//move forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		driver.close();
	}	
}
