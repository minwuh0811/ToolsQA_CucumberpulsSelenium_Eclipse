package CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SeleniumTest {
	
	
 public static void main(String[] args) {
	 
 // Create a new instance of the  driver
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bishe\\ToolsQA_Cucumber\\OnlineStore\\chromedriver.exe");
	 WebDriver driver = (WebDriver) new ChromeDriver();
	driver.get("https://www.skolverket.se/skolutveckling/statistik/sok-statistik-om-forskola-skola-och-vuxenutbildning?sok=SokA");
	driver.findElement(By.id("SOK_A_KOMMUN"));
	driver.findElement(By.xpath("//option[@value='1402']")).click();
	
	//int size_dropdown= myselect.getOptions().size();
	//System.out.println(size_dropdown);

	
	
   
 
 }
 
}