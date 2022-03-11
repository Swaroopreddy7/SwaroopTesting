package day6.pom.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class RegisterTest {
	static WebDriver driver;
	FileInputStream fis;
	Properties prop;
	HomePageClass hp;
	RegisterPageClass rp;
	LoginPageClass lp;
	@Before
	public void beforeClass() throws IOException {
		//create an object for properties class
		fis=new FileInputStream(new File("C:\\Users\\Swaroop Reddy\\eclipse-workspace\\LTIWebDriverTest\\config.properties"));
		prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverpath"));
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //open application
		 driver.get("http://demowebshop.tricentis.com/register");
		 //create an object for Homepage and register page
		 hp=new HomePageClass(driver);
		 rp=new RegisterPageClass(driver);
		 lp=PageFactory.initElements(driver, LoginPageClass.class);
	}
	@After
	public void afterClass() {
		driver.close();
	}
	@Test
	public void RegisterTest() {
		hp.click_register();
		rp.perform_register_male("Sai swaroop reddy", "chappidi","cghappsdidiai@gmail.com", "reddy123", "reddy123");
		String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		Assert.assertEquals("Your registration completed", actualresult);
		driver.findElement(By.linkText("Log out")).click();
	}
	@Test
	public void LoginTest() {
		hp.click_login();
		lp.perform_login("cghappsdidiai@gmail.com","reddy123");
	}
}
