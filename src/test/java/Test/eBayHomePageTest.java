package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.Homepage;

public class eBayHomePageTest {
	WebDriver driver = new FirefoxDriver();
	@Test
	public void HomePageTest(){

	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Homepage hp = new Homepage(driver);
	hp.eBayHomePage();
	
}}
