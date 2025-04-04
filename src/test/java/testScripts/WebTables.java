package testScripts;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WebTables {
  @Test
  public void f() {
	///Relative locator  
	  WebDriver d1=new ChromeDriver();
	d1.get("https://automationbookstore.dev");
	String s=d1.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getDomAttribute("id");
	System.out.println(s);
	
	
	
  }
	
}


