package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	
	public WebDriver driver;
	 
	  public SignIn (WebDriver driver){
		  this.driver=driver;}
		  
public void eBaySignIn(){
	
	driver.findElement(By.xpath(".//*[@placeholder='Email or username'][@type='text']")).sendKeys("su.sohel@gmail.com");
	driver.findElement(By.xpath(".//*[@placeholder='Password'][@type='password'][@autocapitalize='off']")).sendKeys("musicebay123");
	driver.findElement(By.xpath(".//*[@id='sgnBt']")).click();
}

}
