package day7;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestExecution {

	@Test
	public void testcase() {
		//Headless test execution
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver(option);
		webDriver.get("https://www.google.co.in/");
		System.out.println(webDriver.getTitle());
		webDriver.close();
	}
}
