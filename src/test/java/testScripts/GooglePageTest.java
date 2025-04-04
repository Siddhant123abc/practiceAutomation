package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {
  /**
 * 
 */
/**
 * 
 */
@Test
  public void SeleniumSearch() {
	ChromeOptions options=new ChromeOptions();
	options.setBrowserVersion("120");
	
	WebDriver dr=new ChromeDriver(options);
	dr.get("https://the-internet.herokuapp.com/login");
	WebElement name=dr.findElement(By.id("username"));
	name.sendKeys("tomsmith");
	WebElement pwd =dr.findElement(By.id("password"));
	pwd.sendKeys("SuperSecretPassword");
	WebElement btnLogin =dr.findElement(By.className("radius"));
	btnLogin.click();
	
	dr.navigate().back();
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
	
	dr.navigate().forward();
	System.out.println(dr.getCurrentUrl());
	
	dr.findElement(By.linkText("Elemental Selenium")).click();
	dr.findElement(By.partialLinkText("Elemental")).click();
			
  }
}
