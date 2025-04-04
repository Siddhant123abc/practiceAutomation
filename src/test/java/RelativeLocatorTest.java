import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
/**
 * 
 */
public class RelativeLocatorTest {
  @Test
  public void relativeLoc() {
	  
	  WebDriver dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://automationbookstore.dev/");
	  
	  String ss=dr.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getDomAttribute("id");
	  System.out.println(ss);
			  
	  
  }
}
