package day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
public class ReadDataFromCSV {
	static WebDriver driver;

	@Test
	public void LoginTC() throws IOException, CsvException {
		//locate my CSV file
		CSVReader csvReader=new CSVReader(new FileReader("E:\\LTI\\Training selenium\\LoginTestdata.csv"));
		String[] csvCell;
		//read all cell data from csv files
		while((csvCell=csvReader.readNext())!=null) {
			String un=csvCell[0];
			String psd=csvCell[1];
			System.out.println(un+"---"+psd);
			driver.findElement(By.name("userName")).sendKeys(un);
			driver.findElement(By.name("password")).sendKeys(psd);
			driver.findElement(By.name("submit")).click();
			if(driver.getTitle().contains("Login")) {
				System.out.println("valid credentials");
				driver.findElement(By.linkText("SIGN-OFF")).click();
			}else {
				System.out.println("Invalid credentials");
			}
		}
	}
	@Before
	public void beforeclass() {
		System.out.println("Pre-requisite");
		//launch chrome browser
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//open application
			driver.get("https://demo.guru99.com/test/newtours/");
	}
	@After
	public void afterclass() {
		System.out.println("Post-condition");
		driver.close();
	}
}
