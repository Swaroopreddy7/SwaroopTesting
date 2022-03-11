package day5;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderWithInput {
	WebDriver driver;
  @Test(dataProvider = "data")
  public void LoginTest(String un, String pswd) {
	  System.out.println(un+"----"+pswd);
	  driver.findElement(By.name("userName")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(un);
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeMethod
	  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	//open application
	driver.get("https://demo.guru99.com/test/newtours/");
  }
  @AfterMethod
  	public void afterMethod() {
	  driver.close();
  }
  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "mercury", "mercury" },
      new Object[] { "mercury", "b" },
      new Object[] { "", "mercury" },
      new Object[] { "", "" },
    };
  }
}
