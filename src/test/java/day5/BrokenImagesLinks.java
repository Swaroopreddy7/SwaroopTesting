package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
public class BrokenImagesLinks {
	RemoteWebDriver driver;
  @Test
  public void findbrokenlinks() throws IOException {
	  //finding all the links
	  List<WebElement>links=driver.findElements(By.tagName("a"));
		int count = links.size();
		//System.out.println(count);
		for (int i=0;i<count;i++) {
		WebElement link = links.get(i);
        String url= link.getAttribute("href");
		//System.out.println(url);
		URL plink =new URL(url);
		URLConnection urlconnection= plink.openConnection();
		HttpURLConnection httpcon =(HttpURLConnection) urlconnection;
		httpcon.setConnectTimeout(5000);
		httpcon.connect();
		int rescode=httpcon.getResponseCode();
		if(rescode == 200) {
			System.out.println(url+"----->is valid links");
		}else {
			System.err.println(url+"---->is broken links");
			httpcon.disconnect();
		}
			
		}
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Swaroop Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//open application
		driver.get("http://demowebshop.tricentis.com/");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}