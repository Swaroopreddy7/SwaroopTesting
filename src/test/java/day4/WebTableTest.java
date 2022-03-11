package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implictwait statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open application
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		//fetch no of columns
		//*[@id="leftcontainer"]/table/thead/tr[1]/th[1]
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("column size is :" +col.size());
		//fetch no of rows
		//*[@id="leftcontainer"]/table/tbody/tr[1]
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr[1]"));
		System.out.println("no of rows is :" +rows.size());
		//fetch specific data from cell
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]
		String cell=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if(cell.equals("A")) {
			System.out.println("Data Validation is success");
		}else {
			System.out.println("Data is incorrect");
		}
		//check which company is on TOP
		String toplist=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
			System.out.println("Top company id:" +toplist);
			//fetch top5 company list
			for(int i=1;i<=5;i++) {
				String list=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(list);
			}
			driver.close();
	}
}
