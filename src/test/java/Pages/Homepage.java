package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	public WebDriver driver;
	 
	  public Homepage (WebDriver driver){
		  this.driver=driver;

}
public SignIn eBayHomePage(){
	driver.findElement(By.xpath(".//*[@id='gh-ug']/a")).click();
	return new SignIn(driver);
}}