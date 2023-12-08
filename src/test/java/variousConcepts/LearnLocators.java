package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;

	// init method or setup method
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver119.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLocators() {

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		// file upload
		// if the tag is INPUT use Send keys()
		// any other tag than input use Robot class
		// -------This did not work ------------
		driver.findElement(By.className("input-file"))
				.sendKeys("C:\\Users\\komma\\Desktop\\BI Project\\ActiveCustomer.xlsx");

		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();

		driver.navigate().back();
		//driver.findElement(By.partialLinkText("TF-API")).click();
		//CSS selector
        driver.findElement(By.cssSelector("input#profession-1")).click();
        
        //input.input-file 
        driver.findElement(By.cssSelector("input[id='tool-2']")).click();
        driver.findElement(By.cssSelector("input[name='tool'][id='tool-2']")).click();
        driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
        
        //x path
        //absolute path
        driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
        
        //relative
        //driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("remember");
        driver.findElement(By.xpath("//input[@name='Password' and @type='password']")).sendKeys("remember");
        
        driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
        driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]']")).click();
        
	}

}
